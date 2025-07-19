package Arrrays.gfg;

import java.util.Arrays;

public class MissingElement {
	
	public static int missingElement(int n[]) {	
		
		int arr[]=n.clone();
		Arrays.sort(arr);
		int m=0;
		int len=n.length;
		
		for(int i=0;i<len-1;i++) {
			int d=arr[i+1]-arr[i];
			
			if(arr[0]==1) {
				if(d==1) {
					continue;
					
				}
				else {
				return 	 m=arr[i]+1;
					
				}
			}
			else {
			return	m=1;
			}
		}
			return arr[len-1]+1;
		
	}
	//This is my own passing testcases only 54/111
		public static void main(String[] args) {
		//	int arr[]= {3,1,2,5,4,7};
			int arr[]= {8, 2, 4, 5, 3, 7, 1,6};
		//	Arrays.sort(arr);
			int miss=missingElement(arr);
			System.out.println(miss);
		}
}
