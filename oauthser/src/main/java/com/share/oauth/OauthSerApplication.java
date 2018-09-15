package com.share.oauth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class OauthSerApplication {

    public static void main(String[] args) {
        SpringApplication.run(OauthSerApplication.class, args);
    }
}
