package com.engineeringanimuthyam.pattern;

public class ReverseKondaMidhaStraightKonda {
	
	public static  void reverseKondaMidhaStraightKonda() {
			int row=5;
			for(int i=0;i<=row;i++) {
				for(int j=0;j<row-i;j++) {
					System.out.print(" ");
				}
				for(int k=0;k<=i;k++) {
					System.out.print("* ");
				}
			
				System.out.println();
			}
			
			for(int i=1;i<=row;i++) {
				for(int l=1;l<=i;l++) {
					System.out.print(" ");
				}
				for(int j=0;j<=row-i;j++) {
					System.out.print("* ");
				}
				
				System.out.println();
				
			}
	}
		
	
	public static void main(String[] args) {
		reverseKondaMidhaStraightKonda();
	}
}
