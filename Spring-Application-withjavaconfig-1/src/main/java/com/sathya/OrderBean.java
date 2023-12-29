package com.sathya;

public class OrderBean {
	private int oId;
	private String oname;
	private int quantity;
	public OrderBean() {
		super();
	}
	public int getoId() {
		return oId;
	}
	public void setoId(int oId) {
		this.oId = oId;
	}
	public String getOname() {
		return oname;
	}
	public void setOname(String oname) {
		this.oname = oname;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
   public void printOrders()
   {
	   System.out.println(oId+" "+oname+" "+quantity);
   }
}
