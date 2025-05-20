package com.engineeringanimuthyam;

import java.util.Arrays;

public class ReplaceElementswithGreatestElementonRightSide2 {
	
	public  int[] getgreatestElementRight(int[] a) {
		int len=a.length;
		
		int maxright=-1;
		for(int i=len-1;i>=0;i--) {
			
			int prev=a[i];
			a[i]=maxright;
			maxright =Math.max(maxright, prev);
			
			
		}
	
		return a;
		
	}
	
	public static void main(String[] args) {
		
		int[] arr= {17,18,5,4,6,1};
	ReplaceElementswithGreatestElementonRightSide2 re=new	ReplaceElementswithGreatestElementonRightSide2();
	int[] res=re.getgreatestElementRight(arr);
	
	System.out.println(Arrays.toString(res));
		
	}

}
