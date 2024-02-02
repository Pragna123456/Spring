package com.sathya.numbercontroller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BiggestnumberController {
	
	@RequestMapping("/")
	public String numberForm()
	{
		
		return "number";
	}

	@RequestMapping("/req")
	public String biggNum(@RequestParam int fnumber,@RequestParam int snum,@RequestParam int tnum,ModelMap model)
	{
		model.put("key1",fnumber);
		model.put("key2",snum);
		model.put("key3",tnum);
		String message=null;
			 
		if(fnumber>snum && fnumber >tnum)
		{
			message="first number is biggest";
		}
		else if(snum>tnum && snum >fnumber)
		{
			message="second number is biggest";
		}
		else
		{
			message="third number is biggest";
		}
		
				model.put("message",message);

		 	return "result";
		
	}
}
	
