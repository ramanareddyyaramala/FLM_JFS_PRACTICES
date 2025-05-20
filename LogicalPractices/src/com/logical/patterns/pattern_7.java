package com.logical.patterns;

public class pattern_7 {

	public static void main(String[] args) {
		int n=4;
		int num=105;
		for(int i=1;i<=n;i++) {
		
			for(int j=1;j<=n;j++) {
				System.out.print(" "+(char)num--);
				
				if(num<97) {
					num=105;
				}
				
			
			}
			
			System.out.println();
		}

	}

}
