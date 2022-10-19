package com.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Controller {

	@GetMapping("/get")
	public ResponseEntity<String> getInfo(){
		System.out.println("Controller.getInfo()");
		return new ResponseEntity<String>("Get-Mapping fetchin all employee...",HttpStatus.OK);
	}
	@PostMapping("/save")
	public ResponseEntity<String> saveInfo(){
		return new ResponseEntity<String>("Data Saved...",HttpStatus.CREATED);
	}
}
