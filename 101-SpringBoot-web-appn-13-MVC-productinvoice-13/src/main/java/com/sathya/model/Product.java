package com.sathya.model;

public class Product {
	private int cid;
	private String cname;
	private int mobile;
	private String pname;
	private int price;
	private int quant;
	public Product(int cid, String cname, int mobile, String pname, int price, int quant) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.mobile = mobile;
		this.pname = pname;
		this.price = price;
		this.quant = quant;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public int getMobile() {
		return mobile;
	}
	public void setMobile(int mobile) {
		this.mobile = mobile;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuant() {
		return quant;
	}
	public void setQuant(int quant) {
		this.quant = quant;
	}
	@Override
	public String toString() {
		return "Product [cid=" + cid + ", cname=" + cname + ", mobile=" + mobile + ", pname=" + pname + ", price="
				+ price + ", quant=" + quant + "]";
	}

	

}
