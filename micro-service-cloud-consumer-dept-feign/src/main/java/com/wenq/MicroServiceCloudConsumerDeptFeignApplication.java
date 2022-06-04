package com.wenq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @BelongsProject: spring-cloud-demo2
 * @BelongsPackage: com.wenq
 * @Author: WenQiang
 * @CreateTime: 2022-05-28 14:34
 * @Description:
 */
@SpringBootApplication
@EnableFeignClients //开启OpenFeign功能
public class MicroServiceCloudConsumerDeptFeignApplication {
    public static void main(String[] args) {
        SpringApplication.run(MicroServiceCloudConsumerDeptFeignApplication.class,args);
    }
}
