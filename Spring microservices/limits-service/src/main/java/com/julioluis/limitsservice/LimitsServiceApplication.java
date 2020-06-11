package com.julioluis.limitsservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@SpringBootApplication
@EnableDiscoveryClient
public class LimitsServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(LimitsServiceApplication.class, args);
    }

}
