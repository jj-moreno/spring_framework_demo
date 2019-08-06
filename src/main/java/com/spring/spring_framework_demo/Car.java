package com.spring.spring_framework_demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;


@Component
public class Car implements Vehicle {

	@Autowired
	@Qualifier("tire")
	private Tire tire;

	public Tire getTire() {
		return tire;
	}

	public void setTire(Tire tire) {
		this.tire = tire;
	}

	public void drive() {
//		ApplicationContext context = new ClassPathXmlApplicationContext("spring_xml_based_cfg.xml");
//		System.out.println("Driving car with " + context.getBean("tire"));
		System.out.println("Driving car with " + tire);
	}

}
