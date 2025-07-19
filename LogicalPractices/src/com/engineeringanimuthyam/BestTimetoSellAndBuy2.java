package com.engineeringanimuthyam;

public class BestTimetoSellAndBuy2 {
	
	public static int besttimeToBuyandSell(int[] arr) {
		int len=arr.length;
		
		
		int profit=0;
		
		int low=arr[0];
		
		for(int i=1;i<len;i++) {
			
			int temp=arr[i]-low;		//{4,3,5,1,8,2,7,11};
			System.out.println("low :"+low);
			System.out.println("temp :"+temp);
				profit=Math.max(profit, temp);
				
				low=Math.min(low,arr[i]);
				
				
			
		}
		return profit;
	}
	//The time complexity of the code is O(n)
	
	public static void main(String[] args) {
		int[] arr= {4,3,5,1,8,2,7,11};
		
	int res=besttimeToBuyandSell(arr);
	System.out.println(res);
		
	}
}
