package com.arrays13;

public class Day8StockBuyandSellMaxoneTransactionAllowed {
	
	public static int maxOneTransaction(int arr[]) {
		int len=arr.length;
		
		int res=0;
		int minFar=arr[0];
		
		for(int i=1;i<len;i++) {
			minFar=Math.min(minFar,arr[i]);
			
			res=Math.max(res,arr[i]-minFar);
		}
		
		return res;
		
		
	}

	public static void main(String[] args) {
		
		int arr[]= {7, 10, 1, 3, 6, 9, 2};
		
		int res=maxOneTransaction(arr);
		System.out.println(res);
		

	}

}
