package com.sathya;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Javaconfig {
	
	@Bean("id1")
   public ProductBean getProductBean()
   {
	ProductBean p1=new ProductBean();
	p1.setpId(101);
	p1.setPname("dell");
	p1.setPrice(123440.0);
	return p1;
	
	
   }


    @Bean("id2")
    public OrderBean getOrderBean() {
        OrderBean o1 = new OrderBean();
        o1.setoId(102);
        o1.setOname("abc");
        o1.setQuantity(5);
        return o1;
    }
}

