package com.java.spring;

public class Employee {
	private int empid;
	private String ename;
	public Employee(int empid) {
		
		this.empid = empid;
		
	}
	
	  public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	void print() {
		  System.out.println("Employee id: "+empid);
		  System.out.println("EmployeeName: "+ename);
	  }

}
