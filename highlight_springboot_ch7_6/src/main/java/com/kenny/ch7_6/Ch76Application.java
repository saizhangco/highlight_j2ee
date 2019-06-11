package com.kenny.ch7_6;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@SpringBootApplication
public class Ch76Application {

	@RequestMapping("/")
	public String wsPage() {
		return "ws";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(Ch76Application.class, args);
	}

}
