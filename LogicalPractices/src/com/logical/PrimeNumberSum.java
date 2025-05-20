package com.logical;

import java.util.Scanner;

public class PrimeNumberSum {
	
	public static int primeNumberSum(int num) {
		
		
		int sum=0;
		for(int j=2;j<=num;j++) {
			int count=0;
			for(int i=2;i<=Math.sqrt(j);i++) {
				if(j%i==0) {
					count++;
				}
				
			}
			if(count==0) {
				System.out.println("prime Numbers:"+j);
				sum=sum+j;
				
			}
			
		}
		return sum;
		
	}

	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number:");
		
		int num=sc.nextInt();
		int sum=primeNumberSum(num);
		System.out.println("Sum of the Prime Numbers:"+sum);
	}
}
