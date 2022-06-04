package com.wenq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @BelongsProject: spring-cloud-demo2
 * @BelongsPackage: com.wenq
 * @Author: WenQiang
 * @CreateTime: 2022-05-28 16:53
 * @Description:
 */
@SpringBootApplication
@EnableEurekaClient
@EnableCircuitBreaker
public class MicroServiceCloudProviderHystrix8004Application {
    public static void main(String[] args) {
        SpringApplication.run(MicroServiceCloudProviderHystrix8004Application.class,args);
    }
}
