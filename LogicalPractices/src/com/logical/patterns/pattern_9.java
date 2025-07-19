package com.logical.patterns;

public class pattern_9 {

	public static void main(String[] args) {
		int n=4;
		int alpha=65;
		int num=1;
		for(int i=1;i<=n;i++) {
		
			for(int j=1;j<=n;j++) {
				
				if(i%2!=0) {
					
					if(alpha>=65 && alpha<=68) {
						System.out.print((char)alpha);
						alpha++;	
					}
					
					
				}
				else {
					
					if(num>=1 && num<=4) {
						
						System.out.print((num));
						num++;
						
						
					}
					
					
				}
				
			
				
			}
			
			System.out.println();
		}
		

	}

}
