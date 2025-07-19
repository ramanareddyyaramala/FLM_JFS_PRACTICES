package com.string;

public class VariableDefault {

	public static int $;
	public static void main(String[] args) {
		String a_b;
		
		System.out.println($);
		//System.out.println(a_b);//here we will get the compiler error 
		//because of local variable has to initialize 
		//but global variables not required because it prints default values 
		//for these..
	}
}
