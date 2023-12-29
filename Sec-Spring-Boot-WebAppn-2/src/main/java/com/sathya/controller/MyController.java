package com.sathya.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
	
	
	
	@RequestMapping("/url1")
	public String index()
	{
		return "index";
		}

}
