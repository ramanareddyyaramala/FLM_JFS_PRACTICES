package com.constructorchaining;

public class ParentClass {
	  String message;

	    // No-arg constructor
	    ParentClass() {
	        this("Hello from Parent constructor with argument!");
	        System.out.println("Inside Parent no-arg constructor");
	    }

	    // Parameterized constructor
	    ParentClass(String msg) {
	        this.message = msg;
	        System.out.println("Inside Parent parameterized constructor: " + message);
	    }
}
