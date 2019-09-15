package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * description: EurekaServer7002_APP
 * author: 冯凡利
 * create:  2019/9/15 17:47
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServer7002_APP {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServer7002_APP.class, args);
    }
}
