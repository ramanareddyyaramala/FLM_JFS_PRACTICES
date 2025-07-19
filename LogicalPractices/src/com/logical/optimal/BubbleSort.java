package com.logical.optimal;

import java.util.Arrays;

public class BubbleSort {
	public static int[] bubbleSort(int arr[]) {
		int len=arr.length;
		for(int i=0;i<len-1;i++) {
			boolean swapped=false;
			for(int j=0;j<len-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					swapped=true;
				}
				
			}
			if(swapped==false) {
				break;
			}
		}
		return arr;
	}
	
	public static void main(String[] args) {
		int arr[]={2,3,1,5,9,4};
		int [] res=bubbleSort(arr);

		System.out.println(Arrays.toString(res));
	}

}
