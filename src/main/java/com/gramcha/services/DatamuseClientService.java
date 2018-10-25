package com.gramcha.services;

import com.gramcha.model.SoundsLikeResult;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.Date;

/**
 * Created by gramachandran on 25/10/18.
 */
@Service
public class DatamuseClientService {

    private WebClient client = null;
    private WebClient getClient(){
        if(client==null){
            client = WebClient.create("https://api.datamuse.com/");
        }
        return client;
    }
    public Mono<String> getSoundsLike(String word){
        System.out.println("start = "+new Date());
        Mono<SoundsLikeResult[]> soundsLikeResultsMono = getClient().get()
                .uri("words?sl="+word)
                .retrieve()
                .bodyToMono(SoundsLikeResult[].class);
        return soundsLikeResultsMono.map(soundsLikeResultsList -> getBestSoundsLike(soundsLikeResultsList, word));
    }
    public String getBestSoundsLike(SoundsLikeResult[] soundsLikeResultsList, String word){
        int topScore = 0;
        String resultTopWord = word;
        for (SoundsLikeResult item :soundsLikeResultsList){
            if(item.getScore()>topScore){
                topScore = item.getScore();
                resultTopWord = item.getWord();
            }
        }
        System.out.println("end = "+new Date());
        System.out.println("result = "+resultTopWord);
        return resultTopWord;
    }
}
