package com.engineeringanimuthyam;

import java.util.Arrays;

public class ReplaceElementswithGreatestElementonRightSide {
	
	public  int[] getgreatestElementRight(int[] a) {
		int len=a.length;
		
		
		for(int i=0;i<len;i++) {
			int rightMax=-1;
			for(int j=i+1;j<len;j++) {
			
				rightMax=Math.max(rightMax, a[j]);
			
							}
			a[i]=rightMax;
			
		}
	
		return a;
		
	}
	
	public static void main(String[] args) {
		
		int[] arr= {17,18,5,4,6,1};
	ReplaceElementswithGreatestElementonRightSide re=new	ReplaceElementswithGreatestElementonRightSide();
	int[] res=re.getgreatestElementRight(arr);
	
	System.out.println(Arrays.toString(res));
		
	}

}
