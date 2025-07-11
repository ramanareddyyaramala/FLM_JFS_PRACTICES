package Arrrays.gfg;

import com.ArraysPractices.SecondHighest2;

public class SecodnHighest {
	
	public int secondHighest(int[] arr) {
		int len=arr.length;
		
		int firstMax=-1;
		int secondMax=-1;
		
		for(int i=0;i<len;i++) {
			if(arr[i]>firstMax ) {
				secondMax=firstMax;
				firstMax=arr[i];
				
			}
			
			else if(arr[i] !=firstMax && arr[i]>secondMax) {
					secondMax=arr[i];
				}
			}
	
		return secondMax;
		
	}
	
	public static void main(String[] args) {
		int arr[]= {2,1,8,3,4,5,9};
	SecodnHighest sh=	new SecodnHighest();
		int re=sh.secondHighest(arr);
		System.out.println(re);
	}

}
