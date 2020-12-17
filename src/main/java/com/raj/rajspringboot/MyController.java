package com.raj.rajspringboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	@RequestMapping(value = "/hispringboot")
    public String hello() {
    	   return "Hello Spring Boot";
    	}
	

}
