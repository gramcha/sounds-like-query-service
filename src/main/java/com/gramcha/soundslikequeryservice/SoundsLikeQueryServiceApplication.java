package com.gramcha.soundslikequeryservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableDiscoveryClient     // Register this service as uerka client to eureka server
@ComponentScan(basePackages = "com.gramcha.*")
public class SoundsLikeQueryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SoundsLikeQueryServiceApplication.class, args);
	}
}
