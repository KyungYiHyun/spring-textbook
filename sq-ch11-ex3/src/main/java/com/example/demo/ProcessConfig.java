package com.example.demo;


import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class ProcessConfig {

    @Bean
    public WebClient webClient(){
        return WebClient
                .builder().build();
    }
}
