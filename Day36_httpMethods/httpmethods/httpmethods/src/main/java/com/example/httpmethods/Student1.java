package com.example.httpmethods;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
//@Table(name="Student1")
public class Student1 {

	@Id
	private int id;
	private String name;
	public Student1(int id, String name) {
		
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Student1()
	{
		
	}
	
}
