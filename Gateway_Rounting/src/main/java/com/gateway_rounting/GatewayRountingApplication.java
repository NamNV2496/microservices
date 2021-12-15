package com.gateway_rounting;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class GatewayRountingApplication {

    public static void main(String[] args) {
        SpringApplication.run(GatewayRountingApplication.class, args);
    }

}
