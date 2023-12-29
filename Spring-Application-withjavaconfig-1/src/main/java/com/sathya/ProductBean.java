package com.sathya;

public class ProductBean {
	private int pId;
	private String pname;
	private double price;
	public ProductBean() {
		super();
	}
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public void printProduct()
	{
		System.out.println(pId+" "+pname+" "+price);
	}

}
