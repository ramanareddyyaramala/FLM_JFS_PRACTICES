package Arrrays.takeUForward;

import java.util.Arrays;

public class BubbleSort {
	
	public static void main(String[] args) {
	
		int arr[]= {5,1,6,2,7};
		int[] res=sortingMethod(arr);
		System.out.println(Arrays.toString(res));
		
	}
	
	public static int[] sortingMethod(int arr[]) {
		
		 int len=arr.length;
		for(int i=0;i<len-3;i++) {
			for(int j=0;j<len-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		 return arr;
	}
	
	

}
