package com.sathya.Userseeontroller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sathya.model.Users;

@Controller
public class UsersController {
	
	@RequestMapping("/")
	public String userForm(ModelMap model)
	{
		Users users=new Users();
		model.put("users", users);
		return "register";
	}

	@RequestMapping("/register")
	public String forDetails(@ModelAttribute Users users,ModelMap model)
	{
		model.put("users",users);
		 	return "result";
		
	}
}
	
