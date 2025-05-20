package Arrrays.gfg;

import java.util.Arrays;

public class MissingElementOptimal {
	
	public static int missElement(int[] original) {
		int sorted[]=original.clone();
		
		Arrays.sort(original);
		int len=sorted.length;
		for(int i=0;i<len-1;i++ ) {
			int d=sorted[i+1]-sorted[i];
			
			if(sorted[0]!=1) {
				return 1;//if in the array 1 is not available then return 1..
			}
			if(d!=1) {
				return sorted[i]+1;
			}
			
		}
		return sorted[len-1]+1;
		//if all the elements are available then return next number in the series..
	}
	
	
	public static void main(String[] args) {
		int original[]= {2,3,4,9,8};
		int missElement=missElement(original);
		System.out.println(missElement);
	}

}
