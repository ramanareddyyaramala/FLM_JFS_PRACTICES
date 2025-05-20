package com.engineeringanimuthyam;

public class BestTimetoSellAndBuy {
	
	public static int besttimeToBuyandSell(int[] arr) {
		int len=arr.length;
		
		
		int profit=0;
		
		
		for(int i=0;i<len;i++) {
			
			for(int j=i+1;j<len;j++) {
				
				int temp=arr[j]-arr[i];
				
				/*
				 * if(temp>profit) {
				 * 
				 * 
				 * profit=temp; }
				 */
				profit=Math.max(profit, temp);
			}
				
			
		}
		return profit;
	}

	
	public static void main(String[] args) {
		int[] arr= {4,3,5,1,8,2,7,11};
		
	int res=	besttimeToBuyandSell(arr);
	System.out.println(res);
		//It has the time complexity of the O(n2)
//So we need to decrease the time of it to O(n)..		
		
	}
}
