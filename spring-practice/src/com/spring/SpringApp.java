package com.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApp {

	public static void main(String[] args) {

		//Load the Spring Config File
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Retrieve the bean
		Coach theCoach= context.getBean("myCoach",Coach.class);
		
		//Call method on bean
		System.out.println(theCoach.getStatus());
		
		//Close the context
		context.close();
	}

}
