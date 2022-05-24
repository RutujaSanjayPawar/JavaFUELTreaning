package com.example.htmlselectionwebpage;

import java.util.List;

public class Student {
	
	private String firstname;
	private String lastname;
	private String email;
	private String  gender;
	List<String> plang;
    List<String> os;
	
	
	
	public List<String> getPlang() {
		return plang;
	}
	public void setPlang(List<String> plang) {
		this.plang = plang;
	}
	public List<String> getOs() {
		return os;
	}
	public void setOs(List<String> os) {
		this.os = os;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	
	
	
	
	

}
