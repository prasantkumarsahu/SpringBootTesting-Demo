package com.prasant.TestingDemo.controller;

import com.prasant.TestingDemo.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@Autowired
	private GreetingService greetingService;

	@GetMapping("/")
	public ResponseEntity<String> greetings() {
		String greeting = greetingService.greet();
		return ResponseEntity.ok(greeting);
	}
}
