package com.kenny.highlight_spring4.ch3.conditional;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConditionConfig {

	@Bean
	@Conditional(LinuxCondition.class)
	public ListService windowsListService() {
		return new LinuxListService();
	}
	
	@Bean
	@Conditional(WindowsCondition.class)
	public ListService linuxListService() {
		return new WindowsListService();
	}
}
