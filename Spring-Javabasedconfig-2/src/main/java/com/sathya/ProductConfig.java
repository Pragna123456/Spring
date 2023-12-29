package com.sathya;

import java.util.Scanner;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProductConfig {
	
	@Bean("id1")
	public ProductBean getProduct()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter pid,pname,price,quantity...");
		int pid=sc.nextInt();
		String pname=sc.next();
		int price=sc.nextInt();
		double quantity=sc.nextDouble();
		ProductBean p1=new ProductBean(pid, pname, price, price);
		
		return p1;
		
	}
	

}
