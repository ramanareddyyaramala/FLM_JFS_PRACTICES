package com.logical;

class Engine{
	
	void start() {
		System.out.println("Engine get started");
	}
}
class Car{
	
	private Engine engine;
	
	Car(){
		this.engine=new Engine();
	}
	
	void carStart() {
		engine.start();
		System.out.println("Car Started");
	}
	
}






public class HasARelationComposition {
	
	public static void main(String[] args) {
		Car c=new Car();
		c.carStart();
	}
	
	
	
}
/*
 * Composition: A strong relationship where the contained object cannot exist
 * independently of the container. If the container is destroyed, the contained
 * object is also destroyed.
 */

