package com.tqk.config;

import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author tianqikai
 */
@ComponentScan
@Configuration
public class AppConfig {

    @Bean
//    @LoadBalanced // 负载均衡注解
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }


     @Bean
     public RandomRule randomRule() {
         return new RandomRule();
     }
}
