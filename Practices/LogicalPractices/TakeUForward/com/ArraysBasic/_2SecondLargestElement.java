package com.ArraysBasic;

public class _2SecondLargestElement {
	
	public static String secondLargest(int arr[]) {
		int len=arr.length;
		int max=0;
		int secondHighest=0;
		for(int i=0;i<len;i++) {
			if(arr[i]>max) {
				secondHighest=max;
				max=arr[i];
			}
		
			else if(secondHighest<arr[i] && arr[i]<max ) {
				secondHighest=arr[i];
			}
		}
		return secondHighest+"--"+max;
	}
		
	public static void main(String[] args) {
		int arr[]= {43,2,64,53,146,7,14,-2,665,-443};
		String res=secondLargest(arr);
		System.out.println(res);
	}
}
