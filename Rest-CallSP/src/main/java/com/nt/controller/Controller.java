package com.nt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.model.Person;
import com.nt.service.IService;

@RestController
@RequestMapping("/api")
public class Controller {
	@Autowired
	IService service;
	@GetMapping("/get/{lname}")
	public ResponseEntity<List<Person>> getDetails(@PathVariable String lname){
	List<Person> list=service.selectbylname(lname);
	return new ResponseEntity<List<Person>>(list,HttpStatus.OK);
	}
}
