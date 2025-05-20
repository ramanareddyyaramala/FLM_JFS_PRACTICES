package com.logical;

public class LargestNumInArray {

	public static void main(String[] args) {
		int [] arr= {2,3,6,2,7,99,101,2002};
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(max<arr[i])
			max=arr[i];//max value is updated until the 
		}
		System.out.println(max);

	}

}
