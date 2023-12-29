package com.sathya;

public class StudentBean {

	private int stdId;
	private String stdName;
	private double fee;
	//PDC+PSM+PGM+BM
	public StudentBean() {
	 super();
	}
	public int getStdId() {
	 return stdId;
	}
	public void setStdId(int stdId) {
	 this.stdId = stdId;
	}
	public String getStdName() {
	 return stdName;
	}

	public void setStdName(String stdName) {
	 this.stdName = stdName;
	}
	public double getFee() {
	 return fee;
	}
	public void setFee(double fee) {
	 this.fee = fee;
	}
	public void printStudent()
	{
	System.out.println(stdId);
	System.out.println(stdName);
	System.out.println(fee);
	}
	}
