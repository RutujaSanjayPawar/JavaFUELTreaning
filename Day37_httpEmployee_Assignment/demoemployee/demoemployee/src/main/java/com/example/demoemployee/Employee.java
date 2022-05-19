package com.example.demoemployee;

import javax.persistence.Entity;
import javax.persistence.Id;
//import java.util.*;

@Entity
public class Employee {
	@Id
	private int empid;
	private String name;
	private String address;
	//private String email;
	private int phoneNo;
	private int salary;
	
	public Employee()
	{
		
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(int phoneNo) {
		this.phoneNo = phoneNo;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Employee(int empid, String name, String address, int phoneNo, int salary) {
		super();
		this.empid = empid;
		this.name = name;
		this.address = address;
		this.phoneNo = phoneNo;
		this.salary = salary;
	}

	
}
