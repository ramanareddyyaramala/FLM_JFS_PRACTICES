package com.inheritance.constructorcreationforsuperclass;

public class ClassB extends ClassA{
	
	ClassB(){
		System.out.println("Parameterized Constructor");
	}
	
public static void main(String[] args) {
	
	ClassB a=new ClassB();
	
	System.out.println(a);
}


}
