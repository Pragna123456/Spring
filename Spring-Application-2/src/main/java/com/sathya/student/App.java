package com.sathya.student;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static  void main( String[] args )
    {

        ApplicationContext ctx=new ClassPathXmlApplicationContext("spconfig.xml");
       StudentmarkBean m1=(StudentmarkBean)ctx.getBean("id1");
        m1.printMarks();    
}
}