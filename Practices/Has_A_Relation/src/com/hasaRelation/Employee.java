package com.hasaRelation;

public class Employee {
		
	private String empName;
	private String empDesg;
	private double empSal;
	
	public Employee() {
		
	}
	
	public Employee(String empName, String empDesg, double empSal) {
		super();
		this.empName = empName;
		this.empDesg = empDesg;
		this.empSal = empSal;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpDesg() {
		return empDesg;
	}
	public void setEmpDesg(String empDesg) {
		this.empDesg = empDesg;
	}
	public double getEmpSal() {
		return empSal;
	}
	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}

	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empDesg=" + empDesg + ", empSal=" + empSal + "]";
	}
}
