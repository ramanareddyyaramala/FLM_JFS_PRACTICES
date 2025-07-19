package com.strings7;

public class Day16Anagram {
	

    // Convert character to lowercase (ASCII-based)
    public static char toLower(char c) {
        if (c >= 'A' && c <= 'Z') {
            return (char)(c + 32);
        }
        return c;
    }

    // Remove spaces and convert to lowercase
    public static String preprocess(String str) {
        char[] temp = new char[str.length()];
        int index = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c != ' ') {
                temp[index++] = toLower(c);
            }
        }
        return new String(temp, 0, index);
    }

    // Manual sorting (e.g., Bubble Sort)
    public static void sort(char[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    char temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Compare two character arrays
    public static boolean areEqual(char[] a, char[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }

    public static boolean areAnagrams(String str1, String str2) {
        str1 = preprocess(str1);
        str2 = preprocess(str2);

        if (str1.length() != str2.length()) {
            return false;
        }

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        sort(arr1);
        sort(arr2);

        return areEqual(arr1, arr2);
    }

    public static void main(String[] args) {
        System.out.println(areAnagrams("Listen", "Silent"));  // true
        System.out.println(areAnagrams("Hello", "World"));    // false
    }
}
