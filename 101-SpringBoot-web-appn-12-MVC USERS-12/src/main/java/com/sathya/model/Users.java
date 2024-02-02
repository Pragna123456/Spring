package com.sathya.model;

public class Users {
	private String name;
    private String password;
    private String email;
    private String mobile;
    private String address;
	@Override
	public String toString() {
		return "Users [name=" + name + ", password=" + password + ", email=" + email + ", mobile=" + mobile
				+ ", address=" + address + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Users(String name, String password, String email, String mobile, String address) {
		super();
		this.name = name;
		this.password = password;
		this.email = email;
		this.mobile = mobile;
		this.address = address;
	}

   
   
}
