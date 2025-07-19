package com.arrays13;

public class Day1SecondLargestElement {
	
	public static int secondLargestElemet(int arr[]) {
		int len=arr.length;
		int first=Integer.MIN_VALUE;
		int second=Integer.MIN_VALUE;
		
		for(int i=0;i<len;i++) {
			if(first<arr[i]) {
				second=first;
				first=arr[i];
				
			}
			else if(second<arr[i] && first>arr[i]) {
				second=arr[i];
			}
		}
		return second;
		
	}
		
	public static void main(String[] args) {
		int arr[]= {4,5,1,2,9,8};
		int res=secondLargestElemet(arr);
		System.out.println(res);
	}
}
