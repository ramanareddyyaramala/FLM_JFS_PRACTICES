package com.ArraysBasic;

public class _1LargestElementArray {
	
	public static int largestElementArray(int arr[]) {
		int len=arr.length;
		
		int max=Integer.MIN_VALUE;
		
		for(int a:arr) {
			if(max<a) {
				max=a;
				
			}
		}
		
		return max;
	}
		
	public static void main(String[] args) {
		int arr[]= {3,1,5,2,6};
		int res=largestElementArray(arr);
		System.out.println(res);
	}
	
}
