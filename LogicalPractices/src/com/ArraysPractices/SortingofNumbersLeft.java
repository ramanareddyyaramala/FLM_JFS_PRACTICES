package com.ArraysPractices;

import java.util.Arrays;

public class SortingofNumbersLeft {
	 public static int[] zeroFilter(int[] arr){
	        int len=arr.length;
	        int temp[]= new int[len];
	        int index=0;
	        for(int i=0;i<len;i++){
	        	
	        	if(arr[i]!=0) {
	        		temp[index++]=arr[i];
	        	}
	       
	        }
	    int tlen=    temp.length;
	        for(int i=0;i<tlen;i++) {
	        	arr[i]=temp[i];
	        }
	       
	        for(int i=tlen;i<=len-1;i++) {
	        	
	        		arr[i]=0;
	        	
	        }
	        
	        
	        return arr;
	 }
	 public static void main(String[] args) {
		 int[] arr={1,0,2,0,3,2};
	      int[] res=zeroFilter(arr);
	      System.out.println(Arrays.toString(res));
	}
}
