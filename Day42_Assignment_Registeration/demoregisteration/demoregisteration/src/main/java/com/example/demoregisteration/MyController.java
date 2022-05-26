package com.example.demoregisteration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller

public class MyController {

	@Autowired
	UsersRepository userrepo;
	
	@PostMapping("/register")
	public String createUser(@ModelAttribute Users user)
	{
		userrepo.save(user);
		return "index";
	}
	
	@PostMapping("/check")
	public String loginUser(@ModelAttribute Users user)
	{
		String path="invalid";
		List<Users> list1=userrepo.findAll();
		String username=user.getUsername();
		String password=user.getPassword();
		
		for(Users ob:list1)
		{
			if(ob.getUsername().equals(username)&&ob.getPassword().equals(password))
			{
				path="result";
				break;
			}
		}
		return path;
	}
	
	@GetMapping("/newuser")
	public String goToRegister(Model model)
	{
		
	    return "register";	
	}
}
