package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.model.Person;
import com.nt.repo.IPresonRepo;

import jakarta.transaction.Transactional;
@Service
@Transactional
public class PersonServiceImpl implements IService {
	@Autowired
	IPresonRepo repo;
	@Override
	public List<Person> selectbylname(String lname) {
		// TODO Auto-generated method stub
		return repo.selectbylname(lname);
	}

}
