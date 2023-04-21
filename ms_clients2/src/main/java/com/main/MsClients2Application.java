package com.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@EnableEurekaClient
@SpringBootApplication
public class MsClients2Application {

	public static void main(String[] args) {
		SpringApplication.run(MsClients2Application.class, args);
	}

}
