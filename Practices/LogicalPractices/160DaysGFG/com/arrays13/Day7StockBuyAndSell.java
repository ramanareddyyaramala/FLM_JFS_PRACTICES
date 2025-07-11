package com.arrays13;

public class Day7StockBuyAndSell {
	
	public static int stockBuyAndSell(int arr[]) {
		int len=arr.length;
		int res=0;
		for(int i=1;i<len;i++) {
			
			if(arr[i]>arr[i-1]) {
				res=arr[i]-arr[i-1]+res;
			}
			
		}
		return res;
	}
	
	public static void main(String[] args) {
		int arr[]= {100, 180, 260, 310, 40, 535, 695};
		
		int res=stockBuyAndSell(arr);
		System.out.println(res);
		
	}

}
