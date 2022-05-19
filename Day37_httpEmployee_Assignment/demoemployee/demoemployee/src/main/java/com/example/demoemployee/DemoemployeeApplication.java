package com.example.demoemployee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class DemoemployeeApplication {

	public static void main(String[] args) {
         ApplicationContext context;
		
		context=SpringApplication.run(DemoemployeeApplication.class, args);
		EmpRepository emp;
		emp=context.getBean(EmpRepository.class);
		Employee e1=new Employee(001, "Rutuja", "Aurangabad", 90909090, 40000);
		emp.save(e1);
		Employee e2=new Employee(002, "Pallavi", "Nashik", 10101010, 35000);
		emp.save(e2);
		System.out.println("Record Saved");
	}

}
