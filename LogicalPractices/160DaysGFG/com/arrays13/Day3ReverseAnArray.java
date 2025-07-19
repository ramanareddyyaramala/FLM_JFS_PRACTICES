package com.arrays13;

public class Day3ReverseAnArray {
	
	public static int[] reverseArray(int arr[]) {
		int len=arr.length;
		
		
		for(int i=0;i<len/2;i++) {
			
		int	left=arr[i];
		int	right=arr[len-1-i];
			
			arr[i]=right;
			arr[len-1-i]=left;
	
		}
		return arr;
		
	}
	
	
	public static void main(String[] args) {
	int arr[]= {1,2,3,4,5,6};
	
	int[] res=reverseArray(arr);
	
	for(int r:res) {
		System.out.println(r+" ");
	}
	
	}
}
