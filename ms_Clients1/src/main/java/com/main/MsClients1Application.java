package com.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
@EnableEurekaClient
@SpringBootApplication
public class MsClients1Application {

	public static void main(String[] args) {
		SpringApplication.run(MsClients1Application.class, args);
	}

	@Bean
	@LoadBalanced
	public RestTemplate rt()
	{
		RestTemplate rs= new RestTemplate();
		return rs;
	}
}
