package com.nt.service;

import java.util.List;

import org.springframework.data.repository.query.Param;

import com.nt.model.Person;

public interface IService {
	List<Person> selectbylname(String lname);
}
