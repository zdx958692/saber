package com.zdx.saber.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SaberEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SaberEurekaApplication.class, args);
	}
}
