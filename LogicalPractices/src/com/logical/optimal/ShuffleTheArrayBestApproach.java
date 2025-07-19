package com.logical.optimal;

import java.util.Arrays;

public class ShuffleTheArrayBestApproach {
	
	public static int[] shuffleArray(int arr[],int n) {
		
		int len=2*n;
		
		int newArray[]=new int[len];
		
		for(int i=0;i<n;i++) {
			newArray[2*i]=arr[i];
			newArray[(2*i)+1]=arr[n+i];
		}
		
		return newArray;
		
		
		
	}
	
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6};
		int n=arr.length/2;
		
	int shuffleArray[]=	shuffleArray(arr, n);
		System.out.println(Arrays.toString(shuffleArray));
		
	}

}
