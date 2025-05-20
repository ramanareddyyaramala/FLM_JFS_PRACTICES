package com.ArraysPractices;

public class TwoDimentionalArray {
	
	
	  public static void twoDimentionalArray(int arr[][]) { 
		  int row=arr.length;
		  int col=arr[0].length;
	  for(int i=0;i<row;i++) {
		  for(int j=1;j<=1;j++) {
			  
			  System.out.println(arr[i][j]);
	  
		  }
	  }
	  }
	 
	
	public static void main(String[] args) {
		int arr[][]= {{1,2,3,1},{4,5,6,2},{7,8,9,3}};
		twoDimentionalArray(arr);
		  
		
	}
}
