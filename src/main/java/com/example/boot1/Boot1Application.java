package com.example.boot1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * @SpringBootApplication标注一个主程序类 ，说明这是一个springboot应用
 * @ImportResource(locations = {"classpath:beans.xml"})导入spring的配置文件，让其生效
 * Springboot没有配置文件，自己写的也不能识别
 * 推荐使用配置类
 */
//@ImportResource(locations = {"classpath:beans.xml"})
@SpringBootApplication
public class Boot1Application {

    public static void main(String[] args) {
        SpringApplication.run(Boot1Application.class, args);
    }

}
