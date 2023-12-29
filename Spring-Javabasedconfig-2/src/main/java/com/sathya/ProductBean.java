package com.sathya;

public class ProductBean {
	private int pid;
	private String pname;
	private double price;
	private int quantity;
	
	public ProductBean(int pid, String pname, double price, int quantity) {
		this.pid = pid;
		this.pname = pname;
		this.price = price;
		this.quantity = quantity;
}

	public void printProducts() {
		 System.out.println(pid);
    	 System.out.println(pname);
    	 System.out.println(price);
    	 System.out.println(quantity);
    	 
    	 double total=0.0,discount=0.0,gst=0.0,bill=0.0;
    	 total=price*quantity;
    	 
    	 if(total>25000)
    	 {
    		discount=(total*15)/100; 
    	 } 
		
    	 else if(total>=25000&&total<=10000)
    	 {
    		discount=(total*20)/100; 
    	 } 
    	 else if(total>=150000)
    	 {
    		discount=(total*30)/100; 
    	 }
    	 else
    	 {
    		 System.out.println("no discount");
    	 }
    	 gst=(total *18)/100;
    	 bill=(total-discount)+gst;

		 System.out.println("total is.."+total);
		 System.out.println("discount is.."+discount);
		 System.out.println("gst  is.."+gst);
		 System.out.println("bill invoice  is.."+bill);
		 System.out.println("total is completed scuuedd..");

		 
		
	}
}