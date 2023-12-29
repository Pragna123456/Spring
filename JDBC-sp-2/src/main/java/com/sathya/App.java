package com.sathya;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
  	  ApplicationContext ctx=new ClassPathXmlApplicationContext("spconfig.xml");
  	  MobileBean m1=(MobileBean)ctx.getBean("id3");
  	 // m1.createTable();
  	  //m1.insertData();
  	 // m1.deleteData();
  	 // m1.updateData();
  	 // m1.findById();
  	 m1.findAll();
    }
}
