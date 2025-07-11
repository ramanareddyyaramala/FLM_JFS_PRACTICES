package com.logical.patterns;

public class pattern_4 {

	public static void main(String[] args) {
		int n=4;
		int num=9;
		for(int i=1;i<=n;i++) {
			
			
			
			for(int j=1;j<=n;j++) {
				
				if(i==j ||i+j==n+1) {
					num--;
					System.out.print(num);
				
				}
				
				else {
					System.out.print(" ");
				}
				
			}
			
			System.out.println();
		}

	}

}
