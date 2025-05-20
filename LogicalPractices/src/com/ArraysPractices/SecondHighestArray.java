package com.ArraysPractices;

import java.util.Arrays;

public class SecondHighestArray {

	
	public static void main(String[] args) {
		int arr[]= {10,32,12,9,17,20};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		int firstMax=Integer.MIN_VALUE;
		int secondMax=Integer.MIN_VALUE;
		
		for(int num:arr) {
			if(num>firstMax) {
				secondMax=firstMax;
				firstMax=num;
			}
			else {
				if(num>secondMax && num<firstMax) {
					secondMax=num;
				}
			}
		
			
		}
		
		if(secondMax==Integer.MIN_VALUE) {
			System.out.println("There is no highest number");
		}
		else {
			System.out.println("The second highest number is "+secondMax);
		}
		
	}
	
}
