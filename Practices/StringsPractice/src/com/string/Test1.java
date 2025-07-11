package com.string;

public class Test1 {
		
	public static void main(String[] args) {
		String s1="Java is awesome";
		String s2="Java is awesome";
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		
		StringBuilder s3=new StringBuilder("Java is awesome");
		StringBuilder s4=new StringBuilder("Java");
		//System.out.println(s3==s4);
		System.out.println(s3.equals(s4));//This is for the content comparision in 
		//the 
		//s3.append(" is awesome");
		
		System.out.println(s1==s2);//true
		System.out.println(s1.equals(s2));//true
		System.out.println(s3.toString().equals(s1));//true
		System.out.println(s3.equals(s1)+" s3.equals(s1)");
		System.out.println(s3.toString()==s1);//false 
		
	}
}
