package com.gramcha.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.net.UnknownHostException;

/**
 * Created by gramachandran on 25/10/18.
 */
@RestController
public class SoundsLikeQueryController {
    @RequestMapping(path = "/soundslike")
    public Mono<String> synonyms() throws UnknownHostException {
        Mono<String> result = Mono.just("Hello, world - from soundslike");
        return result;
    }
}

