package com.sathya.productcontroller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ProductController {
	
	@RequestMapping("/")
	public String productForm()
	{
		
		return "product";
	}

	@RequestMapping("/req")
	public String product(@RequestParam int cid,@RequestParam String cname,@RequestParam int mobile,@RequestParam String pname,@RequestParam double price,@RequestParam int quant,ModelMap model)
	{
		model.put("key1",cid);
		model.put("key2",cname);
		model.put("key3",mobile);
		model.put("key4",pname);
		model.put("key5",price);
		model.put("key6",quant);

		double totalbill=0.0;
		double gst=0.0;double invoice=0.0;double discount=0.0;
		
		
		totalbill=price*quant;

			 
		if(totalbill > 2500)
		{
			discount=0.1;
		}
		 
		else if(totalbill<=2500 && totalbill >5500)
			{
				discount=1.5;
			}

			else
			{
				discount=2.5;
			}
			discount=totalbill*discount;
			
			gst=0.1*totalbill;
			
			invoice=totalbill-discount+gst;

		
		model.put("invoice",invoice);

		 	return "result";
		
	}
}
	
