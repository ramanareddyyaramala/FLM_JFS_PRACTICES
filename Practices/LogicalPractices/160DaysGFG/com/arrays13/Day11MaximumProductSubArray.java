package com.arrays13;

public class Day11MaximumProductSubArray {
	
	//This is Bruteforece Approach..
	
	/*
	 * public static int maxProductSubArray(int arr[]) { int len=arr.length; int
	 * res=arr[0];
	 *
	 * for(int i=0;i<len;i++) { int max=1; for(int j=i;j<len;j++) { max=max*arr[j];
	 * 
	 * res=Math.max(max, res); } } return res;
	 */
	 static int max(int a, int b, int c) {
	        return Math.max(a, Math.max(b, c));
	    }

	    static int min(int a, int b, int c) {
	        return Math.min(a, Math.min(b, c));
	    }
	
	//This is optimal approach
	public static int maxProductSubArray(int arr[]) {
		int n=arr.length; 

        // max product ending at the current index
        int currMax = arr[0];

        // min product ending at the current index
        int currMin = arr[0];

        // Initialize overall max product
        int maxProd = arr[0];

        // Iterate through the array
        for (int i = 1; i < n; i++) {
            
            // Temporary variable to store the maximum product ending 
            // at the current index
            int temp = max(arr[i], arr[i] * currMax, arr[i] * currMin);

            // Update the minimum product ending at the current index
            currMin = min(arr[i], arr[i] * currMax, arr[i] * currMin);

            // Update the maximum product ending at the current index
            currMax = temp;
            
            // Update the overall maximum product
            maxProd = Math.max(maxProd, currMax);
        }

        return maxProd;
    }
	
	

	
	public static void main(String[] args) {
		int arr[]= { -2, 6, -3, -10, 0, 2 };
		
		int res=maxProductSubArray(arr);
		
		System.out.println(res);
		
	}

}
