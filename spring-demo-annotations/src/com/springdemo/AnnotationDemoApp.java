package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		
		//Read Spring Config File
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Get the Bean from Spring Container
		Coach theCoach = context.getBean("thatSillyCoach",Coach.class);
		
		//Call a method on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		
		//CAll method to get daily fortune
		System.out.println(theCoach.getDailyFortune());
		
		//Close the context
		context.close();
	}

}
