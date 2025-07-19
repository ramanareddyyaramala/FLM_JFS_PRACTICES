package com.arrays13;

import java.util.Arrays;

public class Day5NextPermutation {

	 public static void nextPermutation(int[] arr) {
	        int n = arr.length;

	        // Step 1: Find the first index `i` from the end where arr[i] < arr[i + 1]
	        int i = n - 2;
	        while (i >= 0 && arr[i] >= arr[i + 1]) {
	            i--;
	        }

	        // Step 2: If such an index is found, find the element just larger than arr[i] from the end
	        if (i >= 0) {
	            int j = n - 1;
	            while (arr[j] <= arr[i]) {
	                j--;
	            }
	            // Step 3: Swap arr[i] and arr[j]
	            swap(arr, i, j);
	        }

	        // Step 4: Reverse the elements from i + 1 to end of the array
	        reverse(arr, i + 1, n - 1);
	    }

	    private static void swap(int[] arr, int i, int j) {
	        int temp = arr[i];
	        arr[i] = arr[j];
	        arr[j] = temp;
	    }

	    private static void reverse(int[] arr, int start, int end) {
	        while (start < end) {
	            swap(arr, start, end);
	            start++;
	            end--;
	        }
	    }

	    // Test the code
	    public static void main(String[] args) {
	        int[] arr = {2, 4, 1, 7, 5, 0};
	        nextPermutation(arr);
	        System.out.println("Next Permutation: " + Arrays.toString(arr));
	    }
	}

