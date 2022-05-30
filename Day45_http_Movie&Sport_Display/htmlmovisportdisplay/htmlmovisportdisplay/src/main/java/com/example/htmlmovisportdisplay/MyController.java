package com.example.htmlmovisportdisplay;

import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController {
	@Autowired
	UsersRepository userrepo;
	

	
	@GetMapping("/mainpage")
	public String goToMain(@RequestParam String username,HttpSession session)
	{
		session.setAttribute("fname", username);
		return "main";
	}
	
    @GetMapping("/movies")
    public String goToMovie(HttpSession session,Model model)
    {
    	String n=(String)session.getAttribute("fname");
    	model.addAttribute("n",n);
    	//System.out.println("Name of User: "+n);
    	
    	return "movie";
    }
    
	@GetMapping("/sports")
	public String goToSport(HttpSession session,Model model)
	{
		String n=(String)session.getAttribute("fname");
		model.addAttribute("n",n);
		
		return "sport";
	}

	

}
