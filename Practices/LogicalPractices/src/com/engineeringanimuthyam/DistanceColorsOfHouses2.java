package com.engineeringanimuthyam;

public class DistanceColorsOfHouses2 {
	
	public static int maxDifference(int[] arr) {
		int len=arr.length;
		
		int max=0;
		
		for(int i=0;i<len;i++) {
			
			if(arr[i]!=arr[len-1]) {
				
				max=Math.max(max,len-1-i);
				break;
				
			}
			
			
		}
		
		for(int i=len-1;i>=0;i--) {
			if(arr[0]!=arr[i]) {
				max=Math.max(max,i-0);
				break;
			}
		}
		
		return max;
	}
		
		
		
		


	
	
	public static void main(String[] args) {
		int arr[]= {1,1,1,6,1,1,1};
		int res=	maxDifference(arr);
		System.out.println(res);
	}

}
