package com.java.main;

import java.util.List;

public interface PersonDAO {

	public void save(Person p);
	
	public List<Person> list();
	
}