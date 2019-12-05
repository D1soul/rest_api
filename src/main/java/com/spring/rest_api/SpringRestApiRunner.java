package com.spring.rest_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.spring.rest_api" )
public class SpringRestApiRunner {
    public static void main(String... args){
        SpringApplication.run(SpringRestApiRunner.class);
    }
}
