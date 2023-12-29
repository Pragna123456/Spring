package com.sathya.collection4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProductConfig {
	@Bean("obj")
	public ProductBean getProduct()
	{
	  ModelBean m1=new ModelBean(10, "dell", 900.0, "dell");
	  ModelBean m2=new ModelBean(11, "dell", 950.0, "dellA");	
	  ModelBean m3=new ModelBean(12, "dell", 980.0, "dellB");
	  Scanner sc =new Scanner(System.in);
	  
	  System.out.println("enter the id,name,myMap abd modelobj vales");
	  int proid=sc.nextInt();
	  String proName=sc.next();
	  Map<String, Integer> myMap=new HashMap();
	  
	  myMap.put("dell", 20);
	  myMap.put("lenovo", 30);
	  myMap.put("len", 50);
	  
	  List<ModelBean> modelObj=new ArrayList<ModelBean>();
	  modelObj.add(m1);
	  modelObj.add(m2); 
	  modelObj.add(m3);
	  
	  ProductBean product=new ProductBean(proid, proName, myMap, modelObj);
      
		return product;}

}
