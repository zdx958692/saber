package com.zdx.saber.kaka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SaberKakaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SaberKakaApplication.class, args);
	}
}
