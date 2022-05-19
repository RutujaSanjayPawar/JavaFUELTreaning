package com.example.demoemployee;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController 
{
	@Autowired
	private EmpRepository emp;
	
	@GetMapping("/employee")
	public List<Employee> getAllEmployee()
	{
		return emp.findAll();
	}
	
	@GetMapping("/employee/{empid}")
	public Employee getEmployeeById(@PathVariable("empid")Integer employeeId)
	{
		Optional<Employee> op =emp.findById(employeeId);
		Employee em=op.get();
		return em;
				
	}
	
	@PostMapping("/save")
	public Employee createEmployee(@RequestBody Employee em)
	{
		return emp.save(em);
	}
	
	@PutMapping("/updateemp/{empid}")
	public boolean updateEmployee(@PathVariable(value="empid")Integer employeeId,@RequestBody Employee empDetails)throws Exception{
		boolean f=true;
		try {
			Optional<Employee> op=emp.findById(employeeId);
			Employee em=op.get();
			em.setName(empDetails.getName());
			final Employee updateemp=emp.save(em);
		}catch(Exception e)
		{
			f=false;
		}
		return f;
	}
	
	@DeleteMapping("/deleteemp/{empid}")
	public boolean eleteEmployee(@PathVariable(value="empid") Integer employeeId,@RequestBody Employee empDetails) throws Exception{
		Optional<Employee> op=emp.findById(employeeId);
		Employee em=op.get();
		
		emp.delete(em);
		return true;
	}
	}


