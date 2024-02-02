package com.sathya.employeeontroller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EmployeeController {
	
	@RequestMapping("/")
	public String employeeForm()
	{
		
		return "employee";
	}

	@RequestMapping("/req")
	public String product(@RequestParam int eid,@RequestParam String ename,@RequestParam double salary,ModelMap model)
	{
		model.put("key1",eid);
		model.put("key2",ename);
		model.put("key3",salary);
		
		
		double da=0.0,ta=0.0,hra=0.0,pf=0.0;
		double gross=0.0;
		
		if(salary<3000)
		{
			ta=0.07;
			da=0.09;
			hra=0.11;
			pf=0.15;
		}


		else if(salary>=3000&&salary<5000)
		{
			ta=0.12;
			da=0.13;
			hra=0.17;
			pf=0.22;
		}

		else 
		{
			ta=0.17;
			da=0.19;
			hra=0.21;
			pf=0.25;
		}
 
		ta=ta*salary;
		da=da*salary;
		hra=hra*salary;
		pf=pf*salary;
		
		gross=ta+hra+da-pf;
		model.put("invoice", gross);
		 	return "result";
		
	}
}
	
