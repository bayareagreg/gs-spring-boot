package com.example.springboot;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

KAKAKAKAKAKAKAKAKAKAKAKAKAKAKAKKAKA

@RestController
public class HelloController {

	@RequestMapping("/")
	public String index() {
		return "Greetings #8 from Spring Boot!";
	}

}
