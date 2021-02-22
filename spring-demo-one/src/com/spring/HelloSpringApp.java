package com.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {

		// load the Spring Config File
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// Retrieve the bBean from Spring Container
		Coach theCoach = context.getBean("myCoach",Coach.class);
		
		//Call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		//close the context
		context.close();
		
	}

}
