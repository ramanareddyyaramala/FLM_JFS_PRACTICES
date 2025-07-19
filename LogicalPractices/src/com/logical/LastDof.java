package com.logical;

public class LastDof {

	public static int getLastdDigit(int d) {
		
		int lastDigit=d%10;//if divide the number with the 10 we get last digit of the number..
		return lastDigit;
	}
	public static void main(String[] args) {
		int a=getLastdDigit(545333);
		
		System.out.println(a);
		
	}
}
