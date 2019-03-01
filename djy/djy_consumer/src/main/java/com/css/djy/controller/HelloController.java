package com.css.djy.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.css.djy.People;

@RestController
public class HelloController {
	@RequestMapping("/hello")
	public People getHello() {
		People p = new People("张三","男","24");
		
		return p;
		
	}
}
