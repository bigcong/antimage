package com.cc.antimage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableEurekaServer
@EnableDiscoveryClient
@EnableScheduling
public class AntimageApplication {

	public static void main(String[] args) {
		SpringApplication.run(AntimageApplication.class, args);
	}
}
