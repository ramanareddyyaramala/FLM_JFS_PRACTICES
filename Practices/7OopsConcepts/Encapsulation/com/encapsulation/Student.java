package com.encapsulation;

public class Student {
	
	private int id;
	private String name;
	private int age;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		
		if(age>5 && age<18) {
			return age;
		}
		else {
			System.out.println("invalid age");;
		}
		return 0;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
