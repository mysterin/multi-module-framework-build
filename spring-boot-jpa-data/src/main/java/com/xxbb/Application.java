package com.xxbb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @SpringBootApplilcation 一个注解相当于 @Configuration, @EnableAutoConfiguration, @ComponentScan 三个注解
 * @Configuration 表示这个类是用来配置的
 * @EnableAutoConfiguration 表示自动配置, 比如没有指定数据库就默认配置内存数据库
 * @ComponentScan 表示扫描相关包的类, 默认当前类所在的包
 */
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
