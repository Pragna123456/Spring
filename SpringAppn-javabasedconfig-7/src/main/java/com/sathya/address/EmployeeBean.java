package com.sathya.address;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("id2")
public class EmployeeBean
{
	private int empId;
	private String empName;
	
	public EmployeeBean()
	{
		System.out.println("this is a employee");
	}
	
	public int getEmpId() {
		return empId;
	}
	@Value("120")
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	
	public String getEmpName() {
		return empName;
	}
	
	@Value("sathya")
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	public void printEmp()
	{
		System.out.println(empId);
		System.out.println(empName);
	}
	
}