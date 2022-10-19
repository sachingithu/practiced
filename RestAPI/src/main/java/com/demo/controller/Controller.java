package com.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entity.Company;
import com.demo.entity.Employee;

@RestController
@RequestMapping("/api")
public class Controller {

	
	@GetMapping("/get")
	public ResponseEntity<Employee> getInfo(){
		System.out.println("Controller.getInfo()");
		Company company=new Company("Samyak", "Jalna", 450000.0, "IT");
		Employee employee=new Employee("Sachin", "Jalna", 50000.0,company);
		//return new ResponseEntity<Employee>(employee,HttpStatus.OK);
		return new ResponseEntity<Employee>(employee, HttpStatus.OK);
		
	}
	/*
	@GetMapping("/get")
	public Company getData() {
		return new Company("Samyak", "Jalna", 450000.0, "IT");
	}
	@PostMapping("/save")
	public ResponseEntity<String> saveInfo(){
		return new ResponseEntity<String>("Data Saved...",HttpStatus.CREATED);
	}
	*/
}
