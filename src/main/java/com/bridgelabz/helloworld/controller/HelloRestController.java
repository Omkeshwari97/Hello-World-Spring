package com.bridgelabz.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bridgelabz.helloworld.model.User;

@RestController
@RequestMapping("/hello")
public class HelloRestController 
{
	//uc1
	@RequestMapping(value = {"","/","/home"})
	public String sayHello()
	{
		return "Hello from Bridgelabz";
	}
	
	//uc2
	@RequestMapping(value = {"/query"}, method = RequestMethod.GET)
	public String sayHello(@RequestParam(value = "fname") String fname, @RequestParam(value = "lname") String lname)
	{
		return "Hello " + fname + " " + lname + "!";
	}
	
	//uc3
	@GetMapping ("/param/{name}")
	public String sayHelloParam(@PathVariable String name)
	{
		return "Hello " + name + "!";
	}
	
	//uc4
	@PostMapping("/post")
	public String sayHello(@RequestBody User user)
	{
		return "Hello " + user.getFirstName() + " " + user.getLastName();
	}
	
	//uc5
	@PutMapping("/put/{firstName}")
	public String sayHelloPut(@PathVariable String firstName, @RequestParam(value = "lastName") String lastName)
	{
		return "Hello " + firstName + " " + lastName;
	}
}
