package com.ArraysPractices;

public class SecondHighest2 {
	
	public  static int Secondhigh(int[] arr) {
		
		int len=arr.length;
		
		int highest=arr[0];
		int Shighest=arr[0];
		
		for(int i=1;i<len;i++) {
			
			
				if(arr[i]>highest) {
					Shighest=highest;
					highest=arr[i];
				}
				else if(arr[i]>Shighest && arr[i]<highest) {
					Shighest=arr[i];
				}
				
			}
	
		System.out.println(highest+"------"+Shighest);
		return Shighest;
	}
	
	public static void main(String[] args) {
		int[] arr= {12,43,1,99,22};
	int shi=SecondHighest2.Secondhigh(arr);
	System.out.println(shi);
	}

}
