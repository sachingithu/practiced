package com.nt.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.entity.Actors;

public interface ActorRepo extends JpaRepository<Actors, Integer> {

}
