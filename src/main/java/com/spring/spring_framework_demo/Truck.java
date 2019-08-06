package com.spring.spring_framework_demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Truck implements Vehicle{

	@Autowired
	private Tire tire;
	
	public void drive() {
//		ApplicationContext context = new ClassPathXmlApplicationContext("spring_xml_based_cfg.xml");
//		System.out.println("Driving truck with " + context.getBean("tire"));
		System.out.println("Driving truck with " + tire);
	} 
}
