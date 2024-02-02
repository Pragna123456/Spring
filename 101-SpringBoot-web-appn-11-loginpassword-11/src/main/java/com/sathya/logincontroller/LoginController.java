package com.sathya.logincontroller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	
	@RequestMapping("/")
	public String loginForm()
	{
		
		return "login";
	}

	@RequestMapping("/req")
	public String login(@RequestParam String uname,@RequestParam String password,ModelMap model)
	{
		model.put("key1",uname);
		model.put("key2",password);
		String message=null;

		
		if(uname.equalsIgnoreCase("pragna")&&password.equalsIgnoreCase("navi"))
		{
			message="login sucuuesfully";
		}
			else
			{
				message="login failed";

			}
		
		model.put("message", message);
		
		 	return "result";
		
	}
}
	
