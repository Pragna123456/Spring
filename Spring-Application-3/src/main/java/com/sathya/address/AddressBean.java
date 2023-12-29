package com.sathya.address;

public class AddressBean {

	private int hno;
	private String city;
	private String state;
	public AddressBean() {
		super();
	}
	@Override
	public String toString() {
		return "AddressBean [hno=" + hno + ", city=" + city + ", state=" + state + "]";
	}
	public AddressBean(int hno, String city, String state) {
		super();
		this.hno = hno;
		this.city = city;
		this.state = state;
	}
	
}
