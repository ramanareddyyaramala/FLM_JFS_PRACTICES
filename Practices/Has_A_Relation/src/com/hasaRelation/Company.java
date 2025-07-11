package com.hasaRelation;

public class Company {
		
	private String companyName;
	private String companyLocation;
	private String companyType;
	private Employee employee;
	
	public Company() {
		
	}
	
	public Company(String companyName, String companyLocation, String companyType, Employee employee) {
		super();
		this.companyName = companyName;
		this.companyLocation = companyLocation;
		this.companyType = companyType;
		this.employee = employee;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getCompanyLocation() {
		return companyLocation;
	}
	public void setCompanyLocation(String companyLocation) {
		this.companyLocation = companyLocation;
	}
	public String getCompanyType() {
		return companyType;
	}
	public void setCompanyType(String companyType) {
		this.companyType = companyType;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	@Override
	public String toString() {
		return "Company [companyName=" + companyName + ", companyLocation=" + companyLocation + ", companyType="
				+ companyType + ", employee=" + employee + "]";
	}
	
}
