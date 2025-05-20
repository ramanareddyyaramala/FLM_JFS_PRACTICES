package com.logical;

public class ArrayPrimeNumbers {
		
	public static void main(String[] args) {
		int a[]= {23,32,44,36,95,56,97,57,29,3,7};
		
		for(int i=0;i<a.length;i++) {
			int count=0;//here make it sure to the scope of the count value..
			for(int j=1;j<=a[i];j++) {
				if(a[i]%j==0) {
					count++;
				}
				
				
			}
			if(count==2) {
				System.out.println("This is primenum: "+a[i]);
			}
			else {
				System.out.println("This is not primenum: "+a[i]);
			}
			
		}
	}
}
