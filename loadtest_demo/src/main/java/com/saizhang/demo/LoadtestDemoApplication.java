package com.saizhang.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class LoadtestDemoApplication {

	@RequestMapping("/hello")
	public String sayHello() {
		System.out.println("Hello");
		return "Hello World!";
	}
	
	
	public static void main(String[] args) {
		SpringApplication.run(LoadtestDemoApplication.class, args);
	}

}
