package com.ArraysPractices;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FrequencyofArrayElement {

	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements you want to store");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter the element values into the array");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		
		Map<Integer, Integer> map=new LinkedHashMap<>();
		
		for(int freq:arr) {
			map.put(freq,map.getOrDefault(freq,0)+1);
		}
		
		for(Map.Entry<Integer, Integer> f:map.entrySet()) {
			
			System.out.println(f.getKey()+"----"+f.getValue());
			
			
		}
	}
}
