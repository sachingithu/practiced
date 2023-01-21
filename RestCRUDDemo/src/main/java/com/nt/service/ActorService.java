package com.nt.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Actors;
import com.nt.exceptions.ActorNotFound;
import com.nt.repo.ActorRepo;

@Service
public class ActorService implements IActorService {
	@Autowired
	private ActorRepo repo;
	@Override
	public String saveActor(Actors actors) {
		Actors actor=repo.save(actors);
		return "Actor saved with id "+actor.getId();
	}
	@Override
	public List<Actors> fetchAll() {
		List<Actors> actor=repo.findAll();
		return actor;
	}
	@Override
	public Optional<Actors> getById(Integer id) {
		Optional<Actors> actor=repo.findById(id);
		if(actor.isPresent())
			repo.findById(id);
		else 
			throw new ActorNotFound(id+" Id Actor Not Founded...");
		
		return actor;
	}
	@Override
	public String deleteActor(Integer id) {
		Optional<Actors> opt=repo.findById(id);
		if(opt.isPresent()) 
			repo.deleteById(id);
		else 
			throw new ActorNotFound("Actor Not Found");
		 
		return "Record Deleted...";	
	}
	

}
