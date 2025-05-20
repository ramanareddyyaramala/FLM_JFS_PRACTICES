package com.engineeringanimuthyam;

public class DefanginganIPAddress1108 {
	
	public String defanging(String str) {
		int len=str.length();
		String res="";
		for(int i=0;i<len;i++) {
			char temp=str.charAt(i);
			String tem=String.valueOf(temp);
			
			if(tem.equals(".")){
			
				res=res+"[.]";
			}
			else {
				res=res+tem;
			}
			
		}
		return res;
	}

	public static void main(String[] args) {
		
		String str="1.1.1.1";
		DefanginganIPAddress1108 def=new DefanginganIPAddress1108();
		String s=def.defanging(str);
		
		System.out.println(s);
		
	}
	
	
}
