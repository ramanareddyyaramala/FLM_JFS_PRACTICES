package com.logical;

public class FindTheMissingNumber {

	public static void main(String[] args) {
		int arr[]= {1,2,4,5,6};
		int n=arr.length+1;
		int total=n*(n+1)/2;
		for(int i=0;i<n-1;i++) {
			total=total-arr[i];
		}
		/*
		 * for(int num:arr){
		 * total-=num;
		 * }
		 * 
		 * */
		System.out.println(total);

	}

}
