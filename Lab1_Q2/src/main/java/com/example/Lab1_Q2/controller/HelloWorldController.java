package com.example.Lab1_Q2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloWorldController{
	@GetMapping("/hello")
	public String sayHello() {
		return "Hello World!";
	}
}