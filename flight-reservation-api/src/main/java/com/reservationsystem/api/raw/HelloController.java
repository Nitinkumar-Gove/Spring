package com.reservationsystem.api.raw;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping("/hello")  // by default - its a GET request 
	public String sayHello(){
		return "Hello :)";
	}

}
