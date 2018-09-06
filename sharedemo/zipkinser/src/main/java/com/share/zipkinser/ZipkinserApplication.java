package com.share.zipkinser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.sleuth.zipkin.stream.EnableZipkinStreamServer;
import zipkin.server.internal.EnableZipkinServer;

@SpringBootApplication
@EnableDiscoveryClient
@EnableZipkinStreamServer
//@EnableZipkinServer   //http方式追踪
public class ZipkinserApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZipkinserApplication.class, args);
    }
}
