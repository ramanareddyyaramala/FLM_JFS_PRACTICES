package com.constructorchaining;

public class ChildClass extends ParentClass {
	
	   
    // No-arg constructor
    ChildClass() {
        this(100); // Calls parameterized constructor of Child
        System.out.println("Inside Child no-arg constructor");
    }

    // Parameterized constructor
    ChildClass(int num) {
        super(); // Calls Parent's no-arg constructor
        System.out.println("Inside Child parameterized constructor with number: " + num);
    }

  
}
