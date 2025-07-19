package com.engineeringanimuthyam.pattern;

public class Ben10Watch {
	
	public static  void Ben10() {
		int row=5;
		for(int i=0;i<=row;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<=row-i;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=1;i<=row;i++) {
			for(int j=0;j<=row-i;j++) {
				System.out.print(" ");
			}
			
			for(int k=0;k<=i;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Ben10();
	}

}
