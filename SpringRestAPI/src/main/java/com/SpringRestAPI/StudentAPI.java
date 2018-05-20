package com.SpringRestAPI;

import java.util.Date;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentAPI {

	@RequestMapping(value = "/echoStudentName/{name}")
	public String echoStudentName(@PathVariable("name") String name) {
		return "Hello  " + name + " Responsed on : " + new Date();
	}

	@RequestMapping(value = "/getStudentDetails/{name}")
	public Student getStudentDetails(@PathVariable("name") String name) {
		return new Student(name, "Pune", "MCA");
	}

}
