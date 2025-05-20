package com.privatemodifier;

public class Class2 {
		
	public static void main(String[] args) {
		Class1 class1=new Class1();
	
		//Not accessable bcz private  variable,method,constructor  in the Class1
		//System.out.println(class1.name);
		//class1.getData();
		
		//Class1 classP=new Class("rajesh",24);
		
		System.out.println(class1.age);
	}
}
