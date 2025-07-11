package com.logical;

import java.util.Scanner;

public class asciiValuesforSpecialCharacters {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the character");
		String str=sc.next();
		
		if(str.charAt(0)>=65 && str.charAt(0)<=90 || str.charAt(0)>=97 && str.charAt(0)<=122 ) {
			System.out.println("The enter the character");
		}
		else if(str.charAt(0) >=48 &&str.charAt(0) <=57){
			System.out.println("The enter the character is digits");
		}
		else {
			System.out.println("The enter the character is Special Character");
	}
	}

}
