package com.wenq.config;

//import com.netflix.loadbalancer.IRule;
//import com.netflix.loadbalancer.RandomRule;
//import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @BelongsProject: spring-cloud-demo2
 * @BelongsPackage: com.wenq.config
 * @Author: WenQiang
 * @CreateTime: 2022-05-27 10:50
 * @Description:
 */
@Configuration
public class ConfigBean {

    @Bean //将RestTemplate注入到容器中
    //@LoadBalanced //在客户端使用RestTemplate请求服务端时，开启负载均衡（Ribbon）
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

//    @Bean
//    public IRule myRule(){
//        //RandomRule为随机策略
//        return new RandomRule();
//    }
}
