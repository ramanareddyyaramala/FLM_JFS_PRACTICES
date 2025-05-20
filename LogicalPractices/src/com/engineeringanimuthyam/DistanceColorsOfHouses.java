package com.engineeringanimuthyam;

public class DistanceColorsOfHouses {
	
	public static int maxDifference(int[] arr) {
		int len=arr.length;
		
		int max=0;
		
		for(int i=0;i<len;i++) {
			for(int j=i+1;j<len;j++) {
				if(arr[i]!=arr[j]) {
					int temp=j-i;
					max=Math.max(max, temp);
					
				}
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
