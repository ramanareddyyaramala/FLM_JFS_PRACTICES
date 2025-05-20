package com.ArraysPractices;

public class DiagonalReverseArray {
public static void diagonalArray(int arr[][]) {
		
		int row=arr.length;
		int col=arr[0].length;
		for(int i=0;i<row;i++) {
					System.out.println(arr[i][col-i-1]);
		}
		
	}

	public static void main(String[] args) {
		int arr[][]= {{1,2,3,11},{4,5,6,12},{7,8,9,13}};
		diagonalArray(arr);
	}
}
