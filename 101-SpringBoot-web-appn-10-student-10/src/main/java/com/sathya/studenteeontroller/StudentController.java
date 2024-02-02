package com.sathya.studenteeontroller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class StudentController {
	
	@RequestMapping("/")
	public String studentForm()
	{
		
		return "student";
	}

	@RequestMapping("/req")
	public String student(@RequestParam int sid,@RequestParam String sname,@RequestParam String course,@RequestParam int hibernet,@RequestParam int spring,@RequestParam int springboot,ModelMap model)
	{
		model.put("key1",sid);
		model.put("key2",sname);
		model.put("key3",course);
		model.put("key4",hibernet);
		model.put("key5",spring);
		model.put("key6",springboot);
		

		

	int	total=hibernet+spring+springboot;String grade=null;String result=null;
		double percentage=total/3;
		if(percentage>=70)
		{
			grade="A Grade";
		}
		else if(percentage>=60)
		{
			grade="B Grade";
		}
		else if(percentage>=50)
		{
			grade="C Grade";
		}
		if(hibernet>=35 && spring>=35 && springboot>=35)
		{
			result="Pass";
		}
		else
		{
			result="Fail";
		}
		model.put("total", total);
		model.put("grade", grade);
		model.put("percentage", percentage);

		model.put("result", result);
		
		 	return "result";
		
	}
}
	
