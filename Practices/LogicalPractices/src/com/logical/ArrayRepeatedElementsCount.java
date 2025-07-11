package com.logical;

import java.util.Arrays;
import java.util.List;

public class ArrayRepeatedElementsCount {

	public static void main(String[] args) {
	int arr[]= {1,2,3,4,1,3,2,4,5,2,5,5};//11 222 33 44 555
	Arrays.sort(arr);
	int count=0;
	for(int i=0;i<arr.length-1;i++) {
		if(arr[i]==arr[i+1]) {
			count++;
		}
		else {
		if(count>1) {
		System.out.println("Element:"+arr[i]+"----"+count);
		}
		count=1;
	}
	}
	System.out.println("Element:"+arr[arr.length-1]+"------"+count);
		
	}

}
