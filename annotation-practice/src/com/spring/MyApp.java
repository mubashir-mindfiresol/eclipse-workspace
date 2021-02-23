package com.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {

		//Step - 1
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Step - 2
		Coach theCoach = context.getBean("swimmingCoach",Coach.class);
		
		//Step - 3
		System.out.println(theCoach.getStatus());
		
		//Close the context
		context.close();

	}

}
