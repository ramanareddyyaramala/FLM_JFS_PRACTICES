package com.inheritance.hybrid;

public class Test {

	
		public static void main(String[] args) {
			ClassA classA=new ClassB();
			classA.m1();
			classA.m2();
			ClassB classB=new ClassB();
			classB.m3();//This method is visible to only in ClassB
			//This not in Parent. from the parent reference we won't access
			//this..
		}
		
}
