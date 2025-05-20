package com.arrays13;

import java.util.Arrays;

public class Day4RotateArray {
	
	public static int[] rotateArray(int arr[],int d) {
		
		int len=arr.length;
		
		
		/*
		 * for(int i=0;i<d;i++) { int first=arr[0]; for(int j=0;j<len-1;j++) {
		 * arr[j]=arr[j+1]; } arr[len-1]=first; }
		 */
		
		d=d%len;
		int temp[]=new int[len];
		for(int i=0;i<len-d;i++) {
			
			temp[i]=arr[d+i];
			
		}
		 for (int i = 0; i < d; i++)
	            temp[len - d + i] = arr[i];

		  for (int i = 0; i < len; i++)
	            arr[i] = temp[i];
		
		
		return arr;
	}
		
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		int d=2;
		
		int [] res=rotateArray(arr, d);
		System.out.println(Arrays.toString(res));
	}
	
}
