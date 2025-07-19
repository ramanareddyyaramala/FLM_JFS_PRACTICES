package com.logical;

public class sumofSeriesCubes {
		
	public static double SumofSeries(int n) {
		int sum=0;
		for(int i=1;i<=n;i++) {
			double c=Math.pow(i, 3);
			sum=(int) (sum+c);
		}
		return sum;
	}
	
	public static void main(String[] args) {
		int n=5;
		double sum=SumofSeries(n);
		System.out.println(sum);
	}

}
