package com.engineeringanimuthyam;

public class MaximumDifferenceBetween {
		
		public static int maxDiff(int[] arr) {
			int len=arr.length;
			int max=-1;
			int low=arr[0];
			
			for(int i=1;i<len;i++) {
				
				 if(arr[i]>low) {
					 
					 int temp=arr[i]-low;
					 max=Math.max(max, temp);
					 low=Math.min(low, arr[i]);
					
				 }
				
				
				 
			}
			return max;
		}
		
		public static void main(String[] args) {
			
			
			//int arr[]= {1,5,2,10};
			int arr[]= {7,1,5,4};
		//	int arr[]= {9,4,3,2};
		//	int arr[]= {3,4,1,9,7,8,2};
			int res=maxDiff(arr);
			System.out.println(res);
		}

}
