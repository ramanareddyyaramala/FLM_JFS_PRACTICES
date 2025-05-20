package com.engineeringanimuthyam.pattern;

public class BokkaPadinaKonda {
	
	public static void bokkapadinakonda() {
		
		int row=5;
		
		for(int i=0;i<=row;i++) {
			for(int j=0;j<=row-i-1;j++) {
				System.out.print(" ");
			}
			
			for(int k=0;k<=i*2;k++) {
				
				
				if(k==0 || i==row || k==2*i) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			
			System.out.println();
		}
		
		
	}
	
	
	public static void main(String[] args) {
		
		bokkapadinakonda();
	}

}
