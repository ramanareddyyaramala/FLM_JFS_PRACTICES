package com.logical.sorting;

import java.util.Arrays;

public class SelectionSort {
	
	public static int[] selectionSort(int[] arr) {
		int len=arr.length;
		
		for(int i=0;i<len;i++) {
			int min=i;
			for(int j=i;j<len;j++) {
				if(arr[min]>arr[j]) {
					min=j;
					
				}
			}
			int temp=arr[min];
			arr[min]=arr[i];
			arr[i]=temp;
		}
		return arr;
		
		
	}
	
	public static void main(String[] args) {
		int n[]= {9,1,2,0,-32};
	int[] arr=	selectionSort(n);
		System.out.println(Arrays.toString(arr));
	}

}
