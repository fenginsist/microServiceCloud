package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * description: DeptProvider8001_Application
 * author: 冯凡利
 * create:  2019/9/8 9:38
 */
@SpringBootApplication
@EnableEurekaClient                 //本服务启动后会   自动注册  进eureka服务中
@EnableDiscoveryClient              //开启 服务发现 功能， 可以通过请求 进而发现  所有的服务
public class DeptProvider8003_Application {

    public static void main(String[] args) {
        SpringApplication.run(DeptProvider8003_Application.class, args);
    }
}
