package com.hwhang0917.forward_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class ForwardDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ForwardDemoApplication.class, args);
	}

}
