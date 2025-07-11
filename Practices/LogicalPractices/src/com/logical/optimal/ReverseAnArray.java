package com.logical.optimal;

import java.util.ArrayList;
import java.util.List;

public class ReverseAnArray {
	
	public static void ReverseArray(int arr[]) {
		int len=arr.length;
		
		for(int i=len-1;i>=0;i--) {
		System.out.print(arr[i]+" ");
		}
		
	}
	
	
	public static void main(String[] args) {
		int arr[]= {1,3,4,5,6};
		ReverseArray(arr);
	}

}
