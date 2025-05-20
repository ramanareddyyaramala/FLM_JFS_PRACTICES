package com.logical;

import java.util.Arrays;

public class MergeArrays {
		public static void main(String[] args) {
			int arr1[]= {1,23,43};
			int arr2[]= {2,34,43};
			int merged[]= new int[arr1.length+arr2.length];
			System.arraycopy(arr1, 0, merged, 0, arr1.length); 
			System.arraycopy(arr2, 0, merged, arr1.length, arr2.length); 
			System.out.println(Arrays.toString(merged)); 
		}
}
