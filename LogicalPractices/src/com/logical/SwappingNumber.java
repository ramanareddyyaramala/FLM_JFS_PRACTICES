package com.logical;

public class SwappingNumber {

	public static void main(String[] args) {
		int a=5;
		int b=7;
		int c=9;
		a=a+b+c;//a=5+7+9
		
		c=a-b-c;//c=21-7-9=5
		b=a-b-c;//b=21-7-5=9
		a=a-b-c;//a=21-9-5=7
		//swapping of three number
		
		System.out.println("a: "+a+" "+"b:"+b+" "+"c:"+c);

	}

}
