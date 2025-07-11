package Arrrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayCreation1 {

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of the elements to Store:");
		int n=sc.nextInt();
		
		int arr[]=new int[n];
		
		for(int i=0;i<n;i++) {
			System.out.print("Enter the number to store into the array: ");
			arr[i]=sc.nextInt();
		}
		
		System.out.println(Arrays.toString(arr));
		
	}
}
