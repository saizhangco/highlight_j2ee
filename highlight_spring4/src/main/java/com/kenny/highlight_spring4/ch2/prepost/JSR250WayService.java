package com.kenny.highlight_spring4.ch2.prepost;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class JSR250WayService {

	@PostConstruct
	public void init() {
		System.out.println("jsr250-init-method");
	}
	
	public JSR250WayService() {
		super();
		System.out.println("initial construct - JSR250WayService");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("jsr250-destroy-method");
	}
	
	public void run() {
		System.out.println("jsr250-run");
	}
}
