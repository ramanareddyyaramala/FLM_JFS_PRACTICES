package com.logical;

import java.util.Scanner;

public class PascalTriangle {
	
		public static void main(String[] args)  { 
		/*int rows = 5; 
		for (int i = 0; i < rows; i++) { 
		int num = 1; 
		System.out.format("%" + (rows - i) * 2 + "s", ""); 
		for (int j = 0; j <= i; j++) { 
		System.out.format("%4d", num); 
		num = num * (i - j) / (j + 1); 
		} 
		System.out.println(); 
		} 
		  */
			Scanner sc=new Scanner(System.in);
			int rows=sc.nextInt();
			for(int i=0;i<rows;i++) {
				for(int j=0;j<rows-i;j++) {
					System.out.print(" ");
				}
				int number=1;
				for(int j=0;j<=i;j++) {
					System.out.print(number+" ");
					
					number=number*(i-j)/(j+1);
				}
				System.out.println();
			}
			
			
		}	
		} 

