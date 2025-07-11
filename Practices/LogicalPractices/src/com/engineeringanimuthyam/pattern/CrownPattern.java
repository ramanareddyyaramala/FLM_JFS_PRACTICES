package com.engineeringanimuthyam.pattern;

public class CrownPattern {
	
	public static void crownPattern(int n) {
		
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(j);
			}
			for(int k=n-1;k>=i;k--) {
				System.out.print(" ");
			}
			for(int k=n-1;k>=i+1;k--) {
				System.out.print(" ");
			}
			for(int l=0;l<=i;l++) {
				System.out.print(l);
			}
			
			System.out.println();
		}
		
		
	}
		
		public static void main(String[] args) {
			int num=5;
			crownPattern(num);
		}
}
