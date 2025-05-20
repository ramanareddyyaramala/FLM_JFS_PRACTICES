package com.logical;

public class primeWithBuilInMethods {
	
	public static void main(String[] args) {
		
		int n=71;
		
		boolean isPrime = java.math.BigInteger.valueOf(n).isProbablePrime(100);
		System.out.println(isPrime);
		
	}
	
}
