package com.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController(value = "/")
public class HelloWorldApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloWorldApplication.class, args);
	}

	@GetMapping("message")
	public String message(@RequestParam String inputMessage)
	{
		return inputMessage.toUpperCase();
	}
	
	@GetMapping("add")
	public String addNumbers(@RequestParam Integer num1,@RequestParam Integer num2 )
	{
		int sum = num1+num2;
		return "Sum of "+num1+" and "+num2+" is "+sum;
	}
}
