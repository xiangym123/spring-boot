package com.css.djy.proder.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.css.djy.People;

@RestController
public class Controller {
	
	@RequestMapping("/hello")
	public People getHello() {
		People p = new People("ÕÅÈý","ÄÐ","24");
		
		return p;
		}
		
}
