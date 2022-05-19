package com.example.httpmethods;

//import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.stereotype.Repository;
//import org.springframework.beans.factory.annotation.Autowired;
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
    private StudentRepository stud;
//	
//	@GetMapping("/students")
//	public List<Student1> getAllStudents()
//	{
//		return stud.findAll();
//	}
	
	//Select One Record
	
	@GetMapping("/student/{id}")
	public Student1 getStudentById(@PathVariable("id") Integer studId)
	{
		Optional<Student1> op= stud.findById(studId);
		Student1 st=op.get();
		return st;
				
	}
	
	@PostMapping("/save")
	public Student1 createStudent(@RequestBody Student1 st)
	{
		return stud.save(st);
	}

    @PutMapping("/updatestud/{id}")
	public boolean updateEmployee(@PathVariable(value="id")Integer studId,@RequestBody Student1 studDetails) throws Exception
	{
		boolean f=true;
		try {
			Optional<Student1> op=stud.findById(studId);
			Student1 st=op.get();
			st.setName(studDetails.getName());
			final Student1 updatestud=stud.save(st);
		}catch (Exception e) {
			f=false;
		}
		return f;
	}
	@DeleteMapping("/deletestud/{id}")
	public boolean deleteStudent(@PathVariable(value="id") Integer studId, @RequestBody Student1 studDetails) throws Exception
	{
		Optional<Student1> op=stud.findById(studId);
		Student1 st= op.get();
		
		stud.delete(st);
		return true;
	}
	
	
 
}
