package com.raj.rajspringboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	@RequestMapping(value = "/hispringboot")
    public String hello() {
    	   return "Hello Spring Boot";
    	}
	
	@RequestMapping(value = "/hiraj")
    public String helloRaj() {
    	   return "Hello Raj from Jenkins";
    	   
    	   
    	}
	
	
	@RequestMapping(value = "/hiraj2")
    public String helloRaj2() {
    	   return "Hello Raj 2 from Jenkins";
    	   
    	   
    	   
    	   
    	   
    	   
    	   
    	}
	
}
