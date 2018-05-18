package com.elearning.api.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.elearning.api.dao.po.Person;
import com.elearning.api.service.PersonService;

@RestController
public class PersonController {
 
	private Logger logger = LoggerFactory.getLogger(this.getClass()); 
	
     @Autowired
     private PersonService personService ;
    
     public PersonController() {
    	 logger.debug(" 我是 PersonController，我被实例化了 ");
       System. out .println(" 我是 PersonController，我被实例化了 " );
    }
 
     @RequestMapping( "/person" )
     public Person test(){
        return personService .getPerson();
    }
}