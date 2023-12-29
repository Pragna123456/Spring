package com.sathya.collection4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class App 
{
    public static void main( String[] args )
    {
   	 ApplicationContext ctx=new AnnotationConfigApplicationContext(ProductConfig.class);
  	 ProductBean p1 = (ProductBean) ctx.getBean("id3");
     p1.printProduct();
 }
}
    
