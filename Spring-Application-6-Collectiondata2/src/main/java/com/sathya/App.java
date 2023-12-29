package com.sathya;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	  ApplicationContext ctx=new ClassPathXmlApplicationContext("spconfig.xml");
    	EmployeeBean e1=(EmployeeBean)ctx.getBean("id1");
    	System.out.println("employee id:"+e1.getEmpId());
    	System.out.println("list of projects:"+e1.getEmpProjects());
    	System.out.println("number f projects and companies:"+e1.getEmpMap());
    }
    
}
