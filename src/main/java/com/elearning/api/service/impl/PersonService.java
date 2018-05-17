package com.elearning.api.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elearning.api.dao.PersonDao;
import com.elearning.api.dao.po.Person;

@Service
public class PersonService {
 
     @Autowired
     private PersonDao personDao ;
    
     public PersonService() {
       System. out .println(" 我是 PersonService，我被实例化了 " );
    }
 
     public Person getPerson() {
        return personDao .getPerson();
    }
 
}
