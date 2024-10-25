package com.prasant.TestingDemo.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService{

	@Override
	public String greet() {
		return "Hello Prasant!";
	}
}
