package com.example.jpqlsingleresultlist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class JpqlsingleresultlistApplication {

	public static void main(String[] args) {
		ApplicationContext context;
		context=SpringApplication.run(JpqlsingleresultlistApplication.class, args);
		MyRepository stud;
		stud=context.getBean(MyRepository.class);
		stud.getData();

	}

}
