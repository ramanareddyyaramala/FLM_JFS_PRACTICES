package com.inheritance.multilevel;

public	class Animal {
	
	    void eat() {
	        System.out.println("Eating...");
	    }
	}

	class Dog extends Animal {
	    void bark() {
	        System.out.println("Barking...");
	    }
	    void eat() {
	        System.out.println("Dog Eating...");
	    }
	}

	class Puppy extends Dog {
	    void weep() {
	        System.out.println("Weeping...");
	    }
	}


