package Arrrays.kunalkushwaha;

import java.util.Arrays;

public class _3SumOf1dArray3 {
		
	
	public static int[] sumOfArray(int arr[]) {
		int len=arr.length;
		int farr[]=new int[len];
		for(int i=0;i<len;i++) {
			int sum=0;
			for(int j=0;j<=i;j++) {
				sum=sum+arr[j];
			}
			farr[i]=sum;
		}
		return farr;
		
	}
	
	public static void main(String[] args) {
		int arr[]= {3,1,2,10,1};
		int[] res=sumOfArray(arr);
		System.out.println(Arrays.toString(res));
		
	}
}
