package com.nt.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;

import com.nt.model.Person;

public interface IPresonRepo extends JpaRepository<Person, Integer> {
	@Procedure(name="selectbylname()")
	List<Person> selectbylname(@Param(value = "lname") String lname);
}
