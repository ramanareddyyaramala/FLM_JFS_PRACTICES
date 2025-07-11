package com.arrays13;

public class Day2MoveAllZerosEnd {
	
	public static int[] moveAllZeros(int arr[]) {
		
		int len=arr.length;
		
		int count=0;
		
		for(int i=0;i<len;i++) {
			if(arr[i]!=0) {
				arr[count++]=arr[i];
				
			}
		}
		
		for (int j = count; j < len; j++) {
	        arr[j] = 0; 
	    }
	return arr;	
	}
		
	public static void main(String[] args) {
		
		
		int arr[]= {1,0,2,0,4};
		
		int res[]=moveAllZeros(arr);
		
		
		
		  for(int a:res) { System.out.println(a); }
		 
		
	}
	
	
}
