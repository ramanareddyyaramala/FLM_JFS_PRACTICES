package com.logical;


class Myclass{
	private String name;
	Myclass(String name){
		this.name=name;
	
	}
	
	String getMyclass() {
		return  name;
	}
	
	static Myclass createInstance(String name) {
		return new Myclass(name);
	}

}
public class ObjectCreationWithInstancemethod {

	
	public static void main(String[] args) {
		Myclass myclass=Myclass.createInstance("exampleobject");
		String s=myclass.getMyclass();
		System.out.println(s);
		
	}
	
	
}
