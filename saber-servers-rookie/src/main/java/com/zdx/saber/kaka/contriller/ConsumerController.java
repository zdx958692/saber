package com.zdx.saber.kaka.contriller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author dongxu.zhang 3002691976@qq.com
 * @Description
 * @ClassName ConsumerController
 * @Date Created in 14:17 2018-10-23
 */
@RestController
public class ConsumerController {


    @Autowired
    private RestTemplate restTemplate;
    @GetMapping(value = "ribbon_consumer")
    public String helloConsumer(){
		
		//
        return restTemplate.getForEntity("http://SABER-SERVERS-KAKA/hello",String.class).getBody();
    }
}