package com.example.consumer;

import cn.minsin.feign.annotation.EnableFeignExceptionHandler;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableDiscoveryClient
@SpringBootApplication
@EnableFeignClients
@EnableFeignExceptionHandler
public class Application2 {

    public static void main(String[] args) {
        SpringApplication.run(Application2.class, args);
    }

}
