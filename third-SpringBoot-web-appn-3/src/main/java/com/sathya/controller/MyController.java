package com.sathya.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
	
	@RequestMapping("/about")
	public String aboutPage()
	{
		return "about";
	
	}
	
	@RequestMapping("/contact")
	public String contactPage()
	{
		return "contact";
	
	}
	

	@RequestMapping("/home")
	public String homePage()
	{
		return "home";
		}

	@RequestMapping("/login")
	public String loginPage()
	{
		return "login";
	
	}
	
	@RequestMapping("/reg")
	public String regPage()
	{
		return "reg";
	
	}
	
}


