package com.ArraysPractices;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FrequencyOfElements {

	
	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Number of Elements you want  :");
		int n=sc.nextInt();
		int arr[]=new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		Map<Integer, Integer> frequencymap=new HashMap<>();
		
		for(int num:arr) {
			frequencymap.put(num, frequencymap.getOrDefault(num,0)+1);
		}
		
		for(Map.Entry<Integer, Integer> entry:frequencymap.entrySet()) {
			System.out.println(entry.getKey()+"-----"+entry.getValue());
		}
		
		sc.close();
	}
}
