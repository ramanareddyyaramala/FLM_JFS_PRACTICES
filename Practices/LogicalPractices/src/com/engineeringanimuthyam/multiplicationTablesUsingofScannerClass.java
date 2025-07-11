package com.engineeringanimuthyam;

import java.util.Arrays;
import java.util.Scanner;

public class multiplicationTablesUsingofScannerClass {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the table Number U want:");
		int num=sc.nextInt();
		sc.nextLine();
		
		
		for(int i=1;i<=10;i++) {
			int result=num*i;
			System.out.println(num+"*"+i+"="+result);
		}
		
	}

}
