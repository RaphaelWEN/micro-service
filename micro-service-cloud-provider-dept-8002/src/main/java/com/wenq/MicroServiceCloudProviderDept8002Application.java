package com.wenq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @BelongsProject: spring-cloud-demo2
 * @BelongsPackage: com.wenq
 * @Author: WenQiang
 * @CreateTime: 2022-05-26 17:05
 * @Description:
 */
@SpringBootApplication
@EnableEurekaClient
public class MicroServiceCloudProviderDept8002Application {
    public static void main(String[] args) {
        SpringApplication.run(MicroServiceCloudProviderDept8002Application.class,args);
    }
}
