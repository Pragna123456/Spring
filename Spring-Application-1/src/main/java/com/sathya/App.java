package com.sathya;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
	  ApplicationContext ctx=new ClassPathXmlApplicationContext("spconfig.xml");
       StudentBean s1=(StudentBean)ctx.getBean("id1");
       s1.printStudent();
    }
}
