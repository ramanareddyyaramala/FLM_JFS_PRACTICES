package com.ArraysPractices;

public class DiagonalOfSecondColumn {
	
	public static void diagonalArray(int arr[][]) {
		
		int row=arr.length;
		int col=arr[0].length;
		for(int i=0;i<col-1;i++) {
			System.out.println(arr[i][i+1]);
			}
	}

	public static void main(String[] args) {
		int arr[][]= {{1,2,3,11},{4,5,12},{7,8,9,13}};
		diagonalArray(arr);
	}
	
}
