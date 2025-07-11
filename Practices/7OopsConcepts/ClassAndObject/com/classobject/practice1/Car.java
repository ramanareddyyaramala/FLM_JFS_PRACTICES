package com.classobject.practice1;

public class Car {
	
	String brand;
	int year;
	
	void displayCarInfo() {
		System.out.println("Car Brand Name:"+brand);
		System.out.println("Car Manufacturing year:"+year);
	}
	
	public static void main(String[] args) {
		Car car=new Car();
		car.brand="TATA";
		car.year=2024;
		
		car.displayCarInfo();
	}

}
