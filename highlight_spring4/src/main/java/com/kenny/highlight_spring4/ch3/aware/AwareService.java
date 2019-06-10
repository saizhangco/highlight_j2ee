package com.kenny.highlight_spring4.ch3.aware;

import java.io.IOException;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

@Service
public class AwareService implements BeanNameAware, ResourceLoaderAware {

	private String beanName;
	private ResourceLoader loader;
	
	@Override
	public void setResourceLoader(ResourceLoader resourceLoader) {
		this.loader = resourceLoader;
	}
	@Override
	public void setBeanName(String name) {
		this.beanName = name;
	}
	
	public void outputResult() {
		System.out.println("Bean 's name is :" + beanName);
		Resource resource = loader.getResource("classpath:com/kenny/highlight_spring4/ch3/aware/test.txt");
		try {
			System.out.println("ResourceLoader load file's content is :" + IOUtils.toString(resource.getInputStream()));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
