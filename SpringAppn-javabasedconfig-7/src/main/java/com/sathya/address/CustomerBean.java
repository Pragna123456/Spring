package com.sathya.address;

import org.springframework.stereotype.Component;


@Component("id1")
public class CustomerBean {
	

	public CustomerBean()
	{
		System.out.println(("this is customerbean"));
	}

}
