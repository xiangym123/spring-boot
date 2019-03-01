package com.css.djy.proder.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.css.djy.People;

@RestController
public class Controller {
	@RequestMapping("/getPeople")
	public String getPeople() {
		People people = new People();
		
		
		return people.getName();
		
	}
}
