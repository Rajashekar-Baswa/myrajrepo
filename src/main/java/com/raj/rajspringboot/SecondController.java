package com.raj.rajspringboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecondController {
	
	@RequestMapping(value = "/sec")
    public String hello() {
    	   return "Hello Controller 2";
    	}
	
	@RequestMapping(value = "/hijenkins")
    public String helloJenkins() {
    	   return "Hello Jenkins";
    	}
	
	@RequestMapping(value = "/hijenkinsagain")
    public String helloJenkinsAgain() {
    	   return "Hello Jenkins Again";
    	}
}
