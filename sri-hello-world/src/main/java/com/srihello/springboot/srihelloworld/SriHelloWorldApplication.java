package com.srihello.springboot.srihelloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;

@SpringBootApplication
//(exclude = {ErrorMvcAutoConfiguration.class})
public class SriHelloWorldApplication {

	public static void main(String[] args) {
		SpringApplication.run(SriHelloWorldApplication.class, args);
	}

}
