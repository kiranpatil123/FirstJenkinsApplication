package com.kiran.nandini;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
	
	@GetMapping("/hello")
	public String names() {
		return "Hi Welcome to jenkins";
	}

}
