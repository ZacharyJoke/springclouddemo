package com.share.helloconsumer;

import com.share.helloconsumer.annotation.CustomChannels;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.stream.annotation.EnableBinding;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@EnableHystrixDashboard
@EnableHystrix
@EnableCircuitBreaker
@EnableBinding(CustomChannels.class)
//@EnableBinding(Sink.class)
public class ConsumerSerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerSerApplication.class, args);
    }
}
