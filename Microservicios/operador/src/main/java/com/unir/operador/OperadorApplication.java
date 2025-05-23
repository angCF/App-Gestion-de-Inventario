package com.unir.operador;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
//@EnableDiscoveryClient
public class OperadorApplication {

	@Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
      return builder.build();
    }

	public static void main(String[] args) {
		SpringApplication.run(OperadorApplication.class, args);
	}

}
