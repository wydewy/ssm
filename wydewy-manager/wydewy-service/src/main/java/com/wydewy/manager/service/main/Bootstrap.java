package com.wydewy.manager.service.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Bootstrap {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new  ClassPathXmlApplicationContext(
						"classpath:spring/applicationContext-*.xml");
		context.start();
		while(true){
			Thread.sleep(Long.MAX_VALUE);
		}	
	}
}
