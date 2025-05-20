package com.privatemodifier;

public class Class1 {
		
	private String name="ramanareddy";
	public int age=24;
	
	public Class1() {
		System.out.println("Non Parameterized Constructor");
	}
	
	private Class1(String name,int age) {
		this.name=name;
		this.age=age;
	}
	
	private void getData() {
		System.out.println(name+"---"+age);
	}
	
	@Override
	public String toString() {
		return "Class1 [name=" + name + ", age=" + age + "]";
	}

	public static void main(String[] args) {
		
		Class1 class1=new Class1();
		class1.getData();
		Class1 class2=new Class1("ram",23);
		System.out.println(class2.toString());
		System.out.println(class1.name);
	}
}
