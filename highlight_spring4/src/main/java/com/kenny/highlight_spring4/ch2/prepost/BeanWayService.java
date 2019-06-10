package com.kenny.highlight_spring4.ch2.prepost;

public class BeanWayService {

	public void init() {
		System.out.println("@Bean-init-method");
	}
	
	public BeanWayService() {
		super();
		System.out.println("initial construct - BeanWayService");
	}
	
	public void destroy() {
		System.out.println("@Bean-destroy-method");
	}
	
	public void run() {
		System.out.println("@Bean-run");
	}
}
