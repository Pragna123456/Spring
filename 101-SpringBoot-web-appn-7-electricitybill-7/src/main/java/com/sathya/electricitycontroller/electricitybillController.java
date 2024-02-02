package com.sathya.electricitycontroller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class electricitybillController {
	
	@RequestMapping("/")
	public String electricityForm()
	{
		
		return "electricity";
	}

	@RequestMapping("/req")
	public String biggNum(@RequestParam int cid,@RequestParam String cname,@RequestParam int cread,@RequestParam int pread,ModelMap model)
	{
		model.put("key1",cid);
		model.put("key2",cname);
		model.put("key3",cread);
		model.put("key4",pread);

		int units=cread-pread;
		double rate=0.0;
		double totalbill=0.0;
			 
		if(units > 300 && units<=500)
		{
			rate=1.75;
		}
		else if(units > 600 && units<=700)
		{
			rate=2.75;
		}
		else
		{
			rate=3.75;
		}
		totalbill=units*rate;
		
		model.put("totalbill",totalbill);

		 	return "result";
		
	}
}
	
