package com.logicalStrings;

public class RemoveSpaccesinTheSente13 {
	
	public static String removeSpace(String str) {
		
		String withoutspaces=str.replaceAll(" ","");
		
		return withoutspaces;
	}
	
	
	public static void main(String[] args) {
		String str="This is the only key to success";
		
		String wspace=removeSpace(str);
		
		System.out.println(wspace);
	}

}
