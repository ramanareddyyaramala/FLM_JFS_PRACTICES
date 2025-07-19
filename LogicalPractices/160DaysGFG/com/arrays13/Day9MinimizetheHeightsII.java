package com.arrays13;

import java.util.Arrays;

public class Day9MinimizetheHeightsII {
		
		public static int minimizeHeights(int arr[],int k) {
			int len=arr.length;
			Arrays.sort(arr);
			int res=arr[len-1]-arr[0];
			
			for(int i=1;i<len;i++) {
				if(arr[i]-k<0)
					continue;
				
				   int minH = Math.min(arr[0] + k, arr[i] - k);

		            // Maximum height after modification
		            int maxH = Math.max(arr[i - 1] + k, arr[len - 1] - k);
		            
		            res=Math.min(res,maxH - minH);
			}
			
			return res;
		}
	
		public static void main(String[] args) {
			int arr[]= {1, 5, 8, 10};
			int k=2;
			
			int res=minimizeHeights(arr, k);
			System.out.println(res);
		}
}
