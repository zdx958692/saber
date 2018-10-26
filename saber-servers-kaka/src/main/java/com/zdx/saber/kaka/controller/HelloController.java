package com.zdx.saber.kaka.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.serviceregistry.Registration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


/**
 * @author dongxu.zhang 3002691976@qq.com
 * @Description 测试
 * @ClassName HelloController
 * @Date Created in 14:00 2018-10-22
 */
@RestController
public class HelloController {

    private static Logger logger = LoggerFactory.getLogger(HelloController.class);

    /**
     * 注入发现客户端
     * pom:
     * <dependency>
     * <groupId>org.springframework.cloud</groupId>
     * <artifactId>spring-cloud-commons</artifactId>
     * <version>RELEASE</version>
     * </dependency>
     */
    @Autowired
    private DiscoveryClient client;

    @Autowired
    private Registration registration; // 服务注册

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String index() {
        List<ServiceInstance> instances = client.getInstances(registration.getServiceId());
        for (int i = 0; i < instances.size(); i++) {
            logger.info("/hello,host:" + instances.get(i).getHost() + ",service_id:" + instances.get(i).getServiceId());
        }
        return "Hello World haha";
    }


}