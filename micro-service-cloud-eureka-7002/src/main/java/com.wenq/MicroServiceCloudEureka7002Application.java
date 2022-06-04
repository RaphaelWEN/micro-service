package com.wenq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @BelongsProject: spring-cloud-demo2
 * @BelongsPackage: PACKAGE_NAME
 * @Author: WenQiang
 * @CreateTime: 2022-05-26 14:26
 * @Description:
 */
@SpringBootApplication
@EnableEurekaServer
public class MicroServiceCloudEureka7002Application {
    public static void main(String[] args) {
        SpringApplication.run(MicroServiceCloudEureka7002Application.class,args);
    }
}
