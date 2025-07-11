package com.logical.patterns;

public class pattern_3 {

	public static void main(String[] args) {
		int n=4;
		int num=96;
		for(int i=0;i<=n;i++) {
			
			
			
			for(int j=0;j<=n;j++) {
				
				if(i==j ||i+j==n) {
					num++;
					
					if(num==101) {
						num++;
						System.out.print((char)num);
						
						
					}
					
					else {
						System.out.print((char)num);
					}
				
				}
				
				else {
					System.out.print(" ");
				}
				
			}
			
			System.out.println();
		}

	}

}
