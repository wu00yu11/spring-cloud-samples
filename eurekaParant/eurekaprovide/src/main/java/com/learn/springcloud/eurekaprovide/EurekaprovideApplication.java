package com.learn.springcloud.eurekaprovide;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author jingjing.zhang
 */
@SpringBootApplication
@EnableDiscoveryClient
public class EurekaprovideApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaprovideApplication.class, args);
    }
}
