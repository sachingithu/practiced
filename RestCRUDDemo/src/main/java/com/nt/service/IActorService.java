package com.nt.service;

import java.util.List;
import java.util.Optional;

import com.nt.entity.Actors;

public interface IActorService {
	String saveActor(Actors actors);
	List<Actors> fetchAll();
	Optional<Actors> getById(Integer id);
	String deleteActor(Integer id);
}
