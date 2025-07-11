package com.hasaRelation;

public class Test {
		
	public static void main(String[] args) {
		
		Employee employee1=new Employee();
		employee1.setEmpName("John");
		employee1.setEmpDesg("JavaDevoloper");
		employee1.setEmpSal(77000.987);
		Company company1=new Company("TCS","Hyd","IT Services",employee1);
		
		System.out.println(company1);
		
		Employee employee2=new Employee("Rohith","Frontend",80800.98);
		Company company2=new Company("Wipro","Banglore","IT Services",employee2);
		
		System.out.println(company2);
		
		Employee employee3=new Employee("Philips","SpringBoot Developer",90800.98);
		Company company3=new Company("Deloitte","Banglore","IT Services",employee3);
		
		System.out.println(company3);
	
	
	}
}
