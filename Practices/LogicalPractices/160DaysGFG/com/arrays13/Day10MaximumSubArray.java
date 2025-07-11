package com.arrays13;

public class Day10MaximumSubArray {
	
	public static int maxSubArray(int arr[]) {
		
		  int res = arr[0];
	        int maxEnding = arr[0];

	        for (int i = 1; i < arr.length; i++) {
	            
	            // Find the maximum sum ending at index i by either extending 
	            // the maximum sum subarray ending at index i - 1 or by
	            // starting a new subarray from index i
	            maxEnding = Math.max(maxEnding + arr[i], arr[i]);
	          
	            // Update res if maximum subarray sum ending at index i > res
	            res = Math.max(res, maxEnding);
	        }
	        return res;
		
		
	}
	public static void main(String[] args) {
	
		int arr[]= {-2,-4};
		
		int res=maxSubArray(arr);
		System.out.println(res);
		
		
	}

}
