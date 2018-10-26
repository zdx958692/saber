package com.zdx.saber.kaka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@EnableDiscoveryClient
@SpringBootApplication
public class SaberRookieApplication {

	@Bean
	@LoadBalanced//并通过 @LoadBalanced 注解开启客户端负载均衡。
	RestTemplate restTemplate () {
		return new RestTemplate ();
	}

	public static void main(String[] args) {
		SpringApplication.run(SaberRookieApplication.class, args);
	}
}
