package com.atguigu.springcloud;

import com.atguigu.myrule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * description: DeptConsumer80_APP
 * author: 冯凡利
 * create:  2019/9/8 17:04
 */
@SpringBootApplication
@EnableEurekaClient
//在启动该微服务的时候就能去加载我们的自定义Ribbon配置类，从而使配置生效，形如：
//@RibbonClient(name="MICROSERVICECLOUD-DEPT",configuration=MySelfRule.class)
@RibbonClient(name = "MICROSERVICECLOUD-DEPT", configuration = MySelfRule.class)
public class DeptConsumer80_APP {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer80_APP.class, args);
    }
}
