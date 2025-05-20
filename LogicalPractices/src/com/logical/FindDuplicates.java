package com.logical;

import java.util.Arrays;
import java.util.Scanner;

public class FindDuplicates {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,1,2,3,4,4,5,6,7,1,4,3,9,10,33,55};
		Arrays.sort(arr);
			int count=1;
			for(int i=0;i<arr.length-1;i++) {
				if(arr[i]==arr[i+1]) {
					
					count++;
					
				}
				else {
					if(count>1) {
				System.out.println("Repeated Element"+arr[i]);
				}
					else {
						System.out.println("these are non repeated element"+arr[i]);
					}
				count=1;
				
			}
			
			
			
		
	}
	}
}
