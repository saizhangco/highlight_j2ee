package com.kenny.ch7_4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Ch74Application {

	@RequestMapping("/")
	public String hello() {
		return "hello world!";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(Ch74Application.class, args);
	}

}
