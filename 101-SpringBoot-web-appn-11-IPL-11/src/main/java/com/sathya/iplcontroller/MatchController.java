package com.sathya.iplcontroller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MatchController {
	
	@RequestMapping("/")
	public String studentForm()
	{
		
		return "match";
	}

	@RequestMapping("/req")
	public String match(@RequestParam int pos,@RequestParam String tname,@RequestParam int play,@RequestParam int win,@RequestParam int loss,@RequestParam int totalwin,@RequestParam int totalloss ,ModelMap model)
	{
		model.put("key1",pos);
		model.put("key2",tname);
		model.put("key3",play);
		model.put("key4",win);
		model.put("key5",loss);
		model.put("key6",totalwin);
		model.put("key7",totalloss);

		

		

	

		
		 	return "result";
		
	}
}
	
