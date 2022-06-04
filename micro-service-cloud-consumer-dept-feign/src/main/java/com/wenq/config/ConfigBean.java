package com.wenq.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * @BelongsProject: spring-cloud-demo2
 * @BelongsPackage: com.wenq.config
 * @Author: WenQiang
 * @CreateTime: 2022-05-28 15:10
 * @Description:
 */
@Configuration
public class ConfigBean {
    @Bean
    Logger.Level feignLoggerLevel(){
        return Logger.Level.FULL;
    }
}
