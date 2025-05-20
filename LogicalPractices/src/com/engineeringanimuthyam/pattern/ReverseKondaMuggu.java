package com.engineeringanimuthyam.pattern;

public class ReverseKondaMuggu {
	
	
	public static void reverseKondaMuggu() {
		
		int rows=5;
		for(int i=0;i<=5;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<=rows-i;k++) {
				System.out.print("* ");
			}
			
			
			System.out.println();
		}
		
	}
		
	public static void main(String[] args) {
		
		reverseKondaMuggu();
	}
}
