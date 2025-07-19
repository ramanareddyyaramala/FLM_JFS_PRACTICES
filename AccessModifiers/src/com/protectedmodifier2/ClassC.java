package com.protectedmodifier2;

import com.protectedmodifier.ClassA;

public class ClassC extends ClassA {
	
	public static void main(String[] args) {
		ClassC classA=new ClassC();
		classA.getData();
		System.out.println(classA.name);
	}
}
