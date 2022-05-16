package com.example.onetooneassign;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.example.onetoonedemo.Emp;

@Entity
@Table(name="role")
public class Role {

	@Id
	private int roll_id;
	private String roll_desc;
	
	
	@OneToOne(mappedBy = "rollobj")
	private Emp emp;
	
	public Role()
	{
		
	}

	
	
	public Role(int roll_id, String roll_desc) {
		super();
		this.roll_id = roll_id;
		this.roll_desc = roll_desc;
		//this.emp = emp;
	}


	public int getRoll_id() {
		return roll_id;
	}

	public void setRoll_id(int roll_id) {
		this.roll_id = roll_id;
	}

	public String getRoll_desc() {
		return roll_desc;
	}

	public void setRoll_desc(String roll_desc) {
		this.roll_desc = roll_desc;
	}

	public Emp getEmp() {
		return emp;
	}

	public void setEmp(Emp emp) {
		this.emp = emp;
	}
}
