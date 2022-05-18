package com.example.demoweb1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	@GetMapping("/")
	public String sayHello()
	{
		return "Hello from Spring Boot";
	}
	
	@GetMapping("/hello")
	public String getHello()
	{
		return "Hello World";
	}

}
