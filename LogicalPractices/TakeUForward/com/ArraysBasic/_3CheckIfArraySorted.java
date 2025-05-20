package com.ArraysBasic;

public class _3CheckIfArraySorted {
		
	public static boolean checkSorted(int arr[]) {
		int len=arr.length;
		boolean valueStatus=false;
		int count=-1;
		for(int i=0;i<len-1;i++) {
			if(arr[i]<arr[i+1]) {
				valueStatus= true;
				count++;
			}
			else if (arr[i+1]<arr[i+(len-count-2)]){
				valueStatus=true;
			}
			else {
				valueStatus=false;
			}
		}
		
	return	valueStatus;
		
		
	}
	
	public static void main(String[] args) {
		int arr[]= {3,4,5,1,2};
		boolean res=checkSorted(arr);
		System.out.println(res);
	}
}
