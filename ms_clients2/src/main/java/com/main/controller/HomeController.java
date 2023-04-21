package com.main.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.main.model.Student;

@RestController
public class HomeController {
	
	@RequestMapping ("/exam")
	public Student getData()
	{
		Student s= new Student();
		s.setRollno(2);
		s.setName("Sanik");
		s.setAddr("Tammu");
		s.setUsername("Sanik");
		s.setPassword("123");
		return s;
	}
	
	@RequestMapping ("/getprodata")
	public Student getpro()
	{
		Student s= new Student();
		s.setRollno(3);
		s.setName("Nanik");
		s.setAddr("Sammu");
		s.setUsername("Nanik");
		s.setPassword("123");
		return s;
	}

}
