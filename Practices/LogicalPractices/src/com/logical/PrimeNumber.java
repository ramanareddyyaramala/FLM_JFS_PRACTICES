package com.logical;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		
		        int p = 25; // Limit for checking prime numbers

		        for (int i = 2; i <= p; i++) { // Start from 2, as 1 is not prime
		            int count = 0; // Reset count for each number

		            for (int j = 1; j <= i; j++) {
		                if (i % j == 0) { // Check if j divides i with no remainder
		                    count++;
		                }
		            }

		            if (count == 2) { // If count is exactly 2, then i is prime
		                System.out.println(i + " is prime");
		            }
		        }
		    }
		}

	
