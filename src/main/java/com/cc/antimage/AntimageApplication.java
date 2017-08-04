package com.cc.antimage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableEurekaServer
public class AntimageApplication {

	public static void main(String[] args) {
		SpringApplication.run(AntimageApplication.class, args);
	}
}
