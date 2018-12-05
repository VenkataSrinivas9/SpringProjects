package com.example.demo.restful.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping(path="/mySpring/hello", method=RequestMethod.GET)
	private String get() {
		return "Hello World from Restful API";
	}
}
