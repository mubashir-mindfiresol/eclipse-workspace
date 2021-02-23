package com.spring;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return ("You have been rewarded Rs 1000 today.");
	}

}
