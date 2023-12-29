package com.sathya;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    ApplicationContext ctx=new AnnotationConfigApplicationContext(Javaconfig.class);
    ProductBean pp=(ProductBean)ctx.getBean("id1");
    pp.printProduct();
    
 // Retrieve the OrderBean from the context
    OrderBean oo = (OrderBean) ctx.getBean("id2");
    oo.printOrders();
    }

		
	}

