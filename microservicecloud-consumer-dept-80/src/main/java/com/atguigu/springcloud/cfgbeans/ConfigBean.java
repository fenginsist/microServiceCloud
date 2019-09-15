package com.atguigu.springcloud.cfgbeans;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * description: ConfigBean
 * author: 冯凡利
 * create:  2019/9/8 16:55
 */
@EnableWebMvc
@Configuration
public class ConfigBean {

    @Bean
    @LoadBalanced  // Spring Cloud Ribbon 是基于 Netflix Ribbon 实现的一套客户端  负载均衡的工具。
    public RestTemplate getRestTemplate()
    {
        return new RestTemplate();
    }


    /**
     *  没有显式的声明，则用默认的轮询算法，
     *  如果有显式的声明，则按照声明的使用。
     * @return
     */
    @Bean
    public IRule getRandomRule(){

//        return new RoundRobinRule();   // 默认的轮询 算法。
        return new RandomRule();         // 随机算法
    }

}
//    public UserService getUserService()
//    {
//        return new UserServiceImpl();
//    }
//    applicationContext.xml == ConfigBean(@Configuration)
//<bean id="userService" class="com.atguigu.tmall.UserServiceImpl" />  == @Bean