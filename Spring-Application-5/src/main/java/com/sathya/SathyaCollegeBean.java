package com.sathya;
import java.security.KeyStore.Entry;
import java.security.PublicKey;
import java.util.*;


public class SathyaCollegeBean {
	private static final Object String = null;
	private static final boolean Integer = false;
	private List<String>studentNames;
	private Set<Integer>studentRolls;
	private Map<String, Integer>branchdetails;
	private Properties branchInfos;
	public SathyaCollegeBean() {
		super();
	}
	public List<String> getStudentNames() {
		return studentNames;
	}
	public void setStudentNames(List<String> studentNames) {
		this.studentNames = studentNames;
	}
	public Set<Integer> getStudentRolls() {
		return studentRolls;
	}
	public void setStudentRolls(Set<Integer> studentRolls) {
		this.studentRolls = studentRolls;
	}
	public Map<String, Integer> getBranchdetails() {
		return branchdetails;
	}
	public void setBranchdetails(Map<String, Integer> branchdetails) {
		this.branchdetails = branchdetails;
	}
	public Properties getBranchInfos() {
		return branchInfos;
	}
	public void setBranchInfos(Properties branchInfos) {
		this.branchInfos = branchInfos;
	}
	public void printStudentName()
	{
	   System.out.println("***print student details***");	
	   for (String studentName : studentNames) {
		   if (studentName.startsWith("t")) {
			   System.out.println(studentName);
		}
	   }
		
	}
		
	public void printStudentRolls() {
	
		for (Integer studentRoll : studentRolls) {
			System.out.println(studentRoll);
			
		}
	}
	public void printBranchDetails() {
	    for (Map.Entry<String, Integer> entry : branchdetails.entrySet()) {
	        System.out.println(entry.getKey() + "--->" + entry.getValue());
	    }
	}

	public void printBranchInfo1() {
	
	Set<String>keys=branchInfos.stringPropertyNames();
	for (String key : keys) {
		System.out.println(key+"...>"+branchInfos.getProperty(key));
	}
	}
	
}

