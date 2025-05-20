package Arrrays.kunalkushwaha;

import java.util.Arrays;

public class _8HowManyNumbersSmallerThanCurrentNumber {
	
	public static int [] smllerThanCurrentNumber(int arr[]) {
		int len=arr.length;
		int countArr[]=new int[len];
		for(int i=0;i<len;i++) {
			
			int count=0;
			for(int j=0;j<len;j++) {
				if(arr[i]>arr[j]) {
					countArr[i]=++count;
				}
			}
		}
		
		return countArr;
		
	}
	
	public static void main(String[] args) {
		int arr[]= {8,1,2,2,3};
		int res[]=smllerThanCurrentNumber(arr);
		System.out.println(Arrays.toString(res));
	}
	
}
