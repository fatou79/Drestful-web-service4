package com.fatou.restfulwebservice4.entity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
//	@RequestMapping(method = RequestMethod.GET, path = "/hello-world")
//	public String helloWorld() {
//		return "hello world";
//	}

	
	@GetMapping(path = "/hello-world")
	public String hellowOrdl() {
		return "helloWorld";
	}
	
	@GetMapping(path ="/hello-world-bean")
	public HelloWorldBean helloworldBean() {
	return new HelloWorldBean("Hello World");
	
}
	
	@GetMapping(path = "/hello-world/path-variale/{name}")
	public HelloWorldBean helloworldPathVariable(@PathVariable String name){
		return new HelloWorldBean(String.format("Hello World %S", name));
	}
}