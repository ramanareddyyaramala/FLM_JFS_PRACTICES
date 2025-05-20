package com.logical;

public class perfectnumber {
		public boolean pernumber(int a) {
		int sum=0;
			int i=0;
			for( i=1;i<=a;i++) {
				if(a%i==0 && a!=i) {
					
					sum=sum+i;
				}
				
			}
			
			if(sum==a) {
				return true;
			}
			else {
				return false;
			}
			
			
		}
		public static void main(String[] args) {
			/*
			 * new perfectnumber().pernumber(6); new perfectnumber().pernumber(12); new
			 * perfectnumber().pernumber(496); new perfectnumber().pernumber(55);
			 */
			perfectnumber per=new perfectnumber();
			boolean n=per.pernumber(77);
			System.out.println(n);
			
		}
}


/*This is for the rule of perfect number..
 * 6 → Divisors: 1, 2, 3 → 1 + 2 + 3 = 6 1+2+3=6 ✅ (Perfect Number) 28 →
 * Divisors: 1, 2, 4, 7, 14 → 1 + 2 + 4 + 7 + 14 = 28 1+2+4+7+14=28 ✅ (Perfect
 * Number) 12 → Divisors: 1, 2, 3, 4, 6 → 1 + 2 + 3 + 4 + 6 = 16 ≠ 12
 * 1+2+3+4+6=16  =12 ❌ (Not Perfect)
 */