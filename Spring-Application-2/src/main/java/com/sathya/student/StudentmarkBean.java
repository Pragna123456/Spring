package com.sathya.student;

public class StudentmarkBean {
	private int sid;
	private String sname;
	private int sub1;
	private int sub2;
	private int sub3;
	//PDC+PSM+PGM+BM
	 public StudentmarkBean() {
		super();
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getSub1() {
		return sub1;
	}
	public void setSub1(int sub1) {
		this.sub1 = sub1;
	}
	public int getSub2() {
		return sub2;
	}
	public void setSub2(int sub2) {
		this.sub2 = sub2;
	}
	public int getSub3() {
		return sub3;
	}
	public void setSub3(int sub3) {
		this.sub3 = sub3;
	}
	public void printMarks()
	{
		int total=0;
		double percentage=0.0;
		String result=null,grade=null;
		System.out.println(sid+"\t"+sname);
		System.out.println(sub1+"\t"+sub2+"\t"+sub3);
		total=sub1+sub2+sub3;
		percentage=total/3;
		if(percentage>=70)
		{
			grade="A Grade";
		}
		else if(percentage>=60)
		{
			grade="B Grade";
		}
		else if(percentage>=50)
		{
			grade="C Grade";
		}
		if(sub1>=35 && sub2>=35 && sub3>=35)
		{
			result="Pass";
		}
		else
		{
			result="Fail";
		}
		System.out.println("Total="+total);
		System.out.println("Percentage="+percentage);
		System.out.println("result="+result);
		System.out.println("Grade="+grade);
		
	}
}
