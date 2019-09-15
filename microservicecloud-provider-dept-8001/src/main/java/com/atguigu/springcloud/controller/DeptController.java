package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.Dept;
import com.atguigu.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * description: DeptController
 * author: 冯凡利
 * create:  2019/9/8 9:34
 */
@RestController
public class DeptController {

    @Autowired
    private DeptService deptService;

    /**
     *  注入 服务发现 客户端请求
     */
    @Autowired
    private DiscoveryClient discoveryClient;

    @PostMapping("/dept/add")
    public Boolean add(@RequestBody Dept dept){
        return deptService.add(dept);
    }

    @GetMapping("/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id){
        return deptService.get(id);
    }

    @GetMapping("/dept/list")
    public List<Dept> list(){
        return deptService.list();
    }

    @RequestMapping(value = "/dept/discovery", method = RequestMethod.GET)
    public Object discovery()
    {
        List<String> list = discoveryClient.getServices();
        System.out.println("**********" + list);

        List<ServiceInstance> srvList = discoveryClient.getInstances("MICROSERVICECLOUD-DEPT");
        for (ServiceInstance element : srvList) {
            System.out.println(element.getServiceId() + "\t" + element.getHost() + "\t" + element.getPort() + "\t"
                    + element.getUri());
        }
        return this.discoveryClient;
    }
}
