package Arrrays;

import java.util.Arrays;

public class ShuffleArray {
	
public static int[] shuffleArray(int arr[],int n) {
		
		int len=2*n;
		
		int newArray[]=new int[len];
		int x=0;
		for(int i=0;i<n;i++) {
			newArray[x]=arr[i];
			x=x+2;
		
		}
		 x=1;
		
		for(int i=n;i<len;i++) {
			newArray[x]=arr[n];
			x=x+2;
		}
		
		return newArray;
		
		
		
	}
	
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6};
		int n=arr.length/2;
		
	int shuffleArray[]=	shuffleArray(arr, n);
		System.out.println(Arrays.toString(shuffleArray));
	}

}
