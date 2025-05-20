package com.logical;

import java.util.Arrays;

public class MergeTwoArrays {
	
	public static int[] mergeArrays(int arr[],int arr2[]) {
		int newArray[]=new int[arr.length+arr2.length];
		
		for(int i=0;i<arr.length;i++) {
			newArray[i]=arr[i];
		}
		for(int i=3;i<newArray.length;i++) {
			newArray[i]=arr2[i-3];
		}
		return newArray;
	}
	
	
	public static void main(String[] args) {
		int arr[]= {1,2,3};
		int arr2[]= {4,5,6};
		int res[]=mergeArrays(arr, arr2);
		System.out.println(Arrays.toString(res));
		
		
	}

}
