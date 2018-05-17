package com.elearning.api.dao;

import org.springframework.stereotype.Component;

import com.elearning.api.dao.po.Person;

@Component
public class PersonDao {
	 
	  public PersonDao() {
	     super ();
	    System. out .println(" 我是 PersonDao，我被实例化了 " );
	 }
	 
	  public Person getPerson() {
	     return new Person( "田守枝 " ," 合肥 ");
	 }
	 
	}