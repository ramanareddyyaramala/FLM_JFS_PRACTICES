package com.logical;

import java.util.Arrays;

public class StringArrayCount {

	public static void main(String[] args) {
		String[] arr= {"siva","raja","sreenu","karna","prashanth","ram","shantesh","siva","raja","sreenu","siva","raja","sreenu","karna","prashanth","ram"};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		int count=1;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]==arr[i+1]) {
				count++;
			}
			else {
				System.out.println("Element:"+arr[i]+"-----"+count);
				count=1;
			}
		}
		System.out.println("Element:"+arr[arr.length-1]+"---"+count);
	}

}
