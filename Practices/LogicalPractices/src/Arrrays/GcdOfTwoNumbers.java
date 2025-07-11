package Arrrays;

public class GcdOfTwoNumbers {
	
	public static int gcdNumbers(int a,int b) {
		if(b==0) {
			return a;
		}
		return gcdNumbers(b, a%b);
	}
	
	public static void main(String[] args) {
		int a=16;
		int b=12;
		int res=gcdNumbers(a, b);
		int lcmResult=a*b;
		System.out.println(res);
	}
	
	
}
