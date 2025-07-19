package com.logical;

public class ReverseString2 {
public static void main(String[] args) {
	String str="madama";
	String reverse=new StringBuilder(str).reverse().toString();
	if(reverse.equals(str)) {
		System.out.println(reverse+" This is palindrome");
	}
	else {
		System.out.println("this is not palindrome "+reverse);
	}
}
}
