package com.conditional;

import java.util.Scanner;

public class MarksGrade {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the  Marks:");
		int marks=sc.nextInt();
		if(marks>85 && marks <=100) {
			System.out.println("Grade A+");
		}
		else if(marks>70 && marks<=85) {
			System.out.println("Grade A");
			
		}
		else if(marks>60 && marks<=70) {
			System.out.println("Grade B+");
			
		}
		else if(marks>45 && marks<=60) {
			System.out.println("Grade B");
			
		}
		else {
			System.out.println("Fail");
		}
	}
}
		