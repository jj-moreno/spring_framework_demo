package com.spring.spring_framework_demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	
	public static void main(String[] args) {

		// the following lines use Spring XML based cfg
//		ApplicationContext context = new ClassPathXmlApplicationContext("spring_xml_based_cfg.xml");
//
//		Vehicle obj = (Vehicle) context.getBean("vehicle");
//		obj.drive();
//
//		Tire tire = (Tire) context.getBean("tire");
//		System.out.println(tire);
		
		//the following lines use Spring Annotation based cfg
		ApplicationContext context = new ClassPathXmlApplicationContext("spring_annotation_based_cfg.xml");
		Vehicle vehicle = (Car) context.getBean("car");
		vehicle.drive();
	}
}
