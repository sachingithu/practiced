package com.nt.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.entity.Actors;
import com.nt.service.IActorService;

@RestController
@RequestMapping("/api")
public class Controller {

	@Autowired
	private IActorService service;
	@PostMapping("/saving")
	ResponseEntity<String> saveActor(@RequestBody Actors actors){
		System.out.println("Controller.saveActor()");
		String actor=service.saveActor(actors);
		return new ResponseEntity<String>(actor,HttpStatus.CREATED);
	}
	@GetMapping("/getAll")
	ResponseEntity<List<Actors>> fetchAll(){
		List<Actors> actor=service.fetchAll();
		return new ResponseEntity<List<Actors>>(actor,HttpStatus.OK);
	}
	@GetMapping("get/{id}")
	ResponseEntity<Optional<Actors>> getById(@PathVariable Integer id){
		Optional<Actors> actor=service.getById(id);
		return new ResponseEntity<Optional<Actors>>(actor,HttpStatus.OK);
	}
	@DeleteMapping("del/{id}")
	ResponseEntity<String> deleteActorById(@PathVariable Integer id){
		String msg=service.deleteActor(id);
		return new ResponseEntity<String>(msg,HttpStatus.OK);
	}
}
