package com.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("thatSillyCoach")
public class TennisCoach implements Coach {

	private FortuneService fortuneService;
	
	@Autowired
	public TennisCoach(FortuneService theFortuneService) {
		fortuneService= theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		
		return "Practice Tennis Daily for 5hrs";
	}

	@Override
	public String getDailyFortune() {

		return fortuneService.getFortune();
	}

}
