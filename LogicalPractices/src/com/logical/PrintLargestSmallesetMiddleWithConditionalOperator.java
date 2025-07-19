package com.logical;

import java.util.Scanner;

public class PrintLargestSmallesetMiddleWithConditionalOperator {
	
	
	public static void main(String[] args) {
		
	Scanner sc=	new Scanner(System.in);
	System.out.println("Enter the first number:");
		int num1=sc.nextInt();
		System.out.println("Enter the Second number:");
		int num2=sc.nextInt();
		System.out.println("Enter the third number:");
		int num3=sc.nextInt();
		int greatest=0;
		int middle=0;
		int smallest=0;
		if(num1>=num2 && num1>=num3) {
			greatest=num1;
			if(num2>=num3) {
				middle=num2;
				smallest=num3;
			}
			else {
				middle=num3;
				smallest=num2;
			}
		}
		else if(num2>=num1 && num2>=num3) {
			greatest=num2;
			if(num1>=num3) {
				middle=num1;
				smallest=num2;
			}
			else {
				middle=num2;
				smallest=num1;
			}
		}
			else {
				greatest=num3;
				if(num2>=num1) {
					middle=num2;
					smallest=num1;
				}
				else {
					middle=num1;
					smallest=num2;
				}
			}
		System.out.println("the numbers are greatest "+greatest+" ,middle "+middle+" and smallest "+smallest);
		}
		
		
	}
	

