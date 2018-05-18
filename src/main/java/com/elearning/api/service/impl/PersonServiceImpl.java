package com.elearning.api.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elearning.api.dao.PersonDao;
import com.elearning.api.dao.po.Person;
import com.elearning.api.service.PersonService;

@Service
public class PersonServiceImpl implements PersonService{

	@Autowired
	private PersonDao personDao;

	public PersonServiceImpl() {
	       System. out .println(" 我是 PersonService，我被实例化了 " );
	    }

	public Person getPerson() {
		return personDao.getPerson();
	}

}
