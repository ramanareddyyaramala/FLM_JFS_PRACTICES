package com.logical;

import java.util.Arrays;

public class CheckAnagram {

	public static void main(String[] args) {
	String str1="silent";
	String str2="listen";
	char[] arr1=str1.toCharArray();
	char[] arr2=str2.toCharArray();
	Arrays.sort(arr1);
	Arrays.sort(arr2);
	System.out.println(Arrays.equals(arr1, arr2));
	}
	public static void main1(String[] args) {
		String s1="lover";
		String s2="power";
		char[] arr1=s1.toCharArray();
		char[] arr2=s2.toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		System.out.println(Arrays.equals(arr1, arr2));
	}
	

}
