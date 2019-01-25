package com.boeing.controller;

import javax.ws.rs.core.MediaType;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import cmo.boeing.bean.Customer;

@RestController
public class HelloController {

	
	@GetMapping("/hello-world")
	public String helloWorld() {
		
		return "Hello Wolrd";
		
	}
	
	@RequestMapping(produces=MediaType.APPLICATION_JSON,method=RequestMethod.GET,value="/details")
	@ResponseBody
	public Customer details() {
		Customer c= new Customer();
		c.setId(1);
		c.setName("Test");
		c.setAddress("Chennai");
		return c;
	}
}
