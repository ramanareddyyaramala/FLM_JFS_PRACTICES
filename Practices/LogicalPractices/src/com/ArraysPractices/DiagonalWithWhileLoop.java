package com.ArraysPractices;

public class DiagonalWithWhileLoop {
public static void diagonalArray(int arr[][]) {
		
		int row=arr.length;
		int col=arr[0].length;
		int i=0;
		int j=0;
		while(i<row && j<col) {
			System.out.println(arr[i][j]);
			i=i+1;
			j=j+1;
			
		}
		
	}

	public static void main(String[] args) {
		int arr[][]= {{1,2,3,11},{4,5,6,12},{7,8,9,13}};
		diagonalArray(arr);
	}

}
