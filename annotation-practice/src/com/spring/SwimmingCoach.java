package com.spring;

import org.springframework.stereotype.Component;

@Component
public class SwimmingCoach implements Coach {

	@Override
	public String getStatus() {
		
		return "Complete 5 Laps of SwimmingPool Daily";
	}

}
