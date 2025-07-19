package com.engineeringanimuthyam;

public class DabbaMuggu {

	
	public void dabbaMuggu() {
		
		 int n=5;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				
				
				if(j==n-1) {
					System.out.print("*");
					//This is for the last row of star do not left space.
				}
				else {
					System.out.print("* ");
				}
			}
			System.out.println();
		}
		
	}
	
	public static void main(String[] args) {
		new DabbaMuggu().dabbaMuggu();
	}
	
	
}
