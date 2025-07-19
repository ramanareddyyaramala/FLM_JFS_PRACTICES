package com.logical;

public class ArraySwapping {
	public static void main(String[] args) {
		int arr[]= {41,29,12,32,44,10,33,29};
		//0 --> 1--->29
		//1 --> 2--->12
		//2 --> 3--->32
		//3 --> 0--->41
		
		int temp=arr[3];
		
		arr[3]=arr[0];
		arr[0]=arr[1];
		arr[1]=arr[2];
		arr[2]=temp;
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		
	}
	
	public static void main3(String[] args) {
		//swapping elements in this below way ..this is with only three numbers sorting..
		//0 --> 1--->29
		//1 --> 2--->12
		//2 --> 0--->41
		int arr[]= {41,29,12,32,44,10,33,29};
		
		int temp=arr[2];
		arr[2]=arr[0];
		arr[0]=arr[1];
		arr[1]=temp;
		
		for(int a:arr) {
			System.out.println(a);
		}
		
	}
	public static void main2(String[] args) {
		//swapping of the neighbour elements in the array..
		int arr[]= {41,29,12,32,44,10,33,29};
		int temp=arr[0];
		arr[0]=arr[1];
		arr[1]=temp;
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		
	}
		public static void main1(String[] args) {
			
			int arr[]= {41,29,12,32,44,10,33,29};
			//swapping of the array elements 
			//int len=arr.length-1; //last index value..
			//swapping of the number from the 1st index position with the last index position..
			int temp=arr[0];
			arr[0]=arr[arr.length-1];
			arr[arr.length-1]=temp;
			
			for(int a:arr) {
				System.out.println(a);
			}
			
		}
}
