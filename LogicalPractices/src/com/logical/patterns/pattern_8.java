package com.logical.patterns;

public class pattern_8 {

	public static void main(String[] args) {
		int n=4;
		int num=1;
		for(int i=1;i<=n;i++) {
		
			for(int j=1;j<=n;j++) {
				System.out.print(" "+num++);
				
				if(num>9) {
					num=1;
				}
				
			
			}
			
			System.out.println();
		}

	}

}
