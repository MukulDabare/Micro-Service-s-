package com.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.main.model.Student;
@CrossOrigin ("*")
@RestController
public class HomeController {
	@Autowired
	RestTemplate rt;
	
	@RequestMapping ("/addmission")
	public Student getData()
	{
		Student s= new Student();
		s.setRollno(1);
		s.setName("Manik");
		s.setAddr("Jammu");
		s.setUsername("Manik");
		s.setPassword("123");
		return s;
	}
	
	@RequestMapping ("/getcondata/{un}/{ps}")
	public Student getcon(@PathVariable ("un")String username, 
			@PathVariable ("ps") String password)
	{
		String url="http://zuul/getexam/getprodata";
		//String url="http://localhost:9095/getprodata";
		Student stu = rt.getForObject(url, Student.class);
		return stu;
	}

}
