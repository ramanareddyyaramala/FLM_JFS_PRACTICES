package Arrrays.kunalkushwaha;

import java.util.Arrays;

public class _4ShuffleTheArray {
	
	public static int[] shuffleArray(int[] arr,int n) {
		
		int len=2*n;
		int count=0;
		int newArray[]=new int[len];
		for(int i=0;i<n;i++) {
			
			 newArray[count]=arr[i];
			 newArray[count+1]=arr[n+i];
			 
			 count+=2;
			
		}
		
		
		return newArray;
		
		
	}
	
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,4,3};
		int n=arr.length/2;
		int res[]=shuffleArray(arr, n);
		System.out.println(Arrays.toString(res));
	}
	
	
	
	
}
  