package com.engineeringanimuthyam;




public class MaximumNumberOfStringPairs {
	
	public String reverse(String str) {
		int len=str.length();
		String rev="";
		for(int i=len-1;i>=0;i--) {
			char ch=str.charAt(i);
			rev=rev+String.valueOf(ch);
		}
		return rev; 
	}
	
	public int MaximumPairs(String[] sarr) {
		int len=sarr.length;
		int ans=0;
		for(int i=0;i<len-1;i++) {
			for(int j=i+1;j<len;j++) {
				String a=sarr[i];
				String b=sarr[j];
				String revb=reverse(b);
				if(!b.equals("0")) {
				if(a.equals(revb)) {
					ans=ans+1;
					sarr[j]="0";
					break;
				}
				
			}
			}
			
			
		}
		return ans;
	}
	
	
	public static void main(String[] args) {
		
		String[] sarr= {"ad","da","ac","ca","bd","db"};
		MaximumNumberOfStringPairs r= new MaximumNumberOfStringPairs();
		int res=r.MaximumPairs(sarr);
		System.out.println(res);
	}

}
