package com.sathya;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
  	  ApplicationContext ctx=new ClassPathXmlApplicationContext("spconfig.xml");
  	  UserBean u1=(UserBean)ctx.getBean("id3");
  	 // u1.createTable();
  	 // u1.insertData();
  	  //u1.deleteData();
  	  //u1.updateData();
  	 // u1.findById();
  	 // u1.findAll();
  //	UserBean obj = new UserBean();

    // u1.insertData(103, "rushi", "rushifr@123.com");
  u1.insertDataFromUserInput();
    }
}
