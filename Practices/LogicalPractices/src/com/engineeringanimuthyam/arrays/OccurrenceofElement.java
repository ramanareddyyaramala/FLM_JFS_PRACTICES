package com.engineeringanimuthyam.arrays;

public class OccurrenceofElement {
	
	public static int ElementFreq(int arr[]) {
		int len=arr.length;
		boolean counted[]=new boolean[len];
		int ans=0;
		for(int i=0;i<len;i++) {
			
			if(counted[i]) {
				continue;
			}
			
			int count=1;
			for(int j=i+1;j<len;j++) {
				
				
				if(arr[i]==arr[j]) {
					count++;
					counted[j]=true;
					
				}
				
			}
			if(count>len/2) {
				ans=arr[i];
			}
			
			
		}
		return ans;
		
	}
	
	public static void main(String[] args) {
		
		int arr[]= {1,2,1,3,1};
	int res=	ElementFreq(arr);
	System.out.println(res);
		
	}

}
