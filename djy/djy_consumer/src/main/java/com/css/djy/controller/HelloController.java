package com.css.djy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.css.djy.People;

@RestController
public class HelloController {
	@Autowired
    private RestTemplate restTemplate;
	@RequestMapping("/getPeople")
	public String getPeople() {
		String apiURL = "http://localhost:8090/hello";
		People people  =  restTemplate.getForObject(apiURL, People.class);
		return people.getName();
		
	}
}
