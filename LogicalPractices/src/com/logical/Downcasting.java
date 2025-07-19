package com.logical;

class parent{
	void m() {
		System.out.println("The parent method");
	}
}

class child extends parent{
	void m() {
		System.out.println("This is child method");
	}
}




public class Downcasting {
	public static void main(String[] args) {
		parent p=new child();
		
		if(p instanceof child) {
			child c=(child)p;//down casting..
			c.m();//i think call child method..
			
		}
		else {
			System.out.println("get the error");
		}
		
		
		
	}
	

}
