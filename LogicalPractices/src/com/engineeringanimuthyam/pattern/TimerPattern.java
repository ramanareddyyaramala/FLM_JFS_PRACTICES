package com.engineeringanimuthyam.pattern;

public class TimerPattern {
	
	public static void Pattern(int n) {
		for(int i=n;i>=1;i--) {
			
			for(int j=0;j<=n-i;j++) {
				System.out.print(" ");
			}
			
			for(int j=1;j<=i;j++) {
				System.out.print(" *");
			}
			System.out.println();
		}
		for(int i=1;i<=n;i++) {
		for(int j=1;j<=n-i;j++) {
			System.out.print(" ");
		}
		
		for(int j=0;j<=i;j++) {
			System.out.print(" *");
		}
		System.out.println();
	}
	}

	public static void main(String[] args) {
		int n=5;
		Pattern(n);
	}

}
