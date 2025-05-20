package com.engineeringanimuthyam;

public class finalValueAfterOperations {
	
	public static int findValueAfterOperationss(String[] operations) {
		int X=0;
		int len=operations.length;
		
		for(int i=0;i<len;i++) {
			String temp=operations[i];
			if(temp.equals("X++") || temp.equals("++X")) {
				X=X+1;
			}
			else {
				X=X-1;
			}
			
			
		}
		
		return X;
		
		
	}

	
	public static void main(String[] args) {
		
		String[] str= {"X++","++X","X--"};
		
		int result=finalValueAfterOperations.findValueAfterOperationss(str);
		
		System.out.println(result);
	}
}
