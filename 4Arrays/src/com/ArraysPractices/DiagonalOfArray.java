package com.ArraysPractices;

public class DiagonalOfArray {
	
	public static void diagonalArray(int arr[][]) {
		
		int row=arr.length;
		int col=arr[0].length;
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				if(j==col-i-1&&i==i) {
					System.out.println(arr[i][j]);
				}
			}
		}
		
	}

	public static void main(String[] args) {
		int arr[][]= {{1,2,3},{4,5,6},{7,8,9}};
		diagonalArray(arr);
	}
	
}
