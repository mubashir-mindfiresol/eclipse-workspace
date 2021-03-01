package com.demo.spring.firstdemo.rest;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

	@Value("${coach.name}")
	private String coachName;
	
	@Value("${team.name}")
	private String teamName;
	
	//expose new endpoint
	@GetMapping("/teaminfo")
	public String getTeamInfo() {
		return "Coach : "+ coachName + ", Team : "+teamName;
	}
	
	//expose "/" hat return "Hello World"
	@GetMapping("/")
	public String sayHello() {
		return "Hello World!! Time on server is " + LocalDateTime.now();
	}
	
	@GetMapping("/workout")
	public String getDailyWorkout() {
		return "Do a heavy Workout";
	}
	
	@GetMapping("/fortune")
	public String fortuneGenerator() {
		return "today is your Lucky Day";
	}
}