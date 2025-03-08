package com.example.demo;


import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ProcessConfig {

    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
