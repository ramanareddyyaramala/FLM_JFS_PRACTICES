package com.logical;

public class countofanumber {

	public static int CountofNumber(int num) {
		 int count=0;
		 final	int  org=num;
			
			/*String snum=String.valueOf(num);
			
			
			 * for(char ch:snum.toCharArray()) { int digit=Character.getNumericValue(ch);
			 * if(digit !=0 && num%digit==0) { count++; } }
			 */
			while(0<num) {
				
				int remainder=num%10;
				
				if(remainder!=0 && org%remainder==0) {
					count++;
				}
				num=num/10;		
				
			}
			
			
			
			return count;
	    }

	public static void main(String[] args) {
		int num = 2446;
		int count = CountofNumber(num);
		System.out.println(count);
	}

}
