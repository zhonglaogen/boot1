package com.example.boot1.config;

import com.example.boot1.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Configuration指明当前类是一个配置类，代替配置文件
 * 在配置文件加<bean></bean>
 */
@Configuration
public class MyConfig {

    /**
     * 将方法返回值加入容器中，容器中这个组件的默认id就是方法名
     */
    @Bean
    public HelloService helloService(){
        System.out.println("add bean -----------------------");
        return new HelloService();
    }
}
