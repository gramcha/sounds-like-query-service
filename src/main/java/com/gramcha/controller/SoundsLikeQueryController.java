package com.gramcha.controller;

import com.gramcha.services.DatamuseClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.net.UnknownHostException;

/**
 * Created by gramachandran on 25/10/18.
 */
@RestController
public class SoundsLikeQueryController {
    @Autowired
    DatamuseClientService datamuseClientService;

    @RequestMapping(path = "/soundslike/{word}")
    public Mono<String> synonyms(@PathVariable String word) throws UnknownHostException {
        return datamuseClientService.getSoundsLike(word);
    }
}

