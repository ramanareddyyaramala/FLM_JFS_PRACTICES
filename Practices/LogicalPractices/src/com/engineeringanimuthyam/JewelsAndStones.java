package com.engineeringanimuthyam;

public class JewelsAndStones {
	
	public int JewelsStonesCount(String jewels,String stones) {
		
		int len=stones.length();
		int count=0;
		for(int i=0;i<len;i++) {
			 
				char ch=stones.charAt(i);
				String temp=String.valueOf(ch);
				
				if(jewels.contains(temp)) {
					count=count+1;
				}
			
			
			
			
		}
		return count;
	}
	
	public static void main(String[] args) {
		String jewels="Aa";
		String stones="aAaAcc";
		JewelsAndStones obj=new JewelsAndStones();
		int count=obj.JewelsStonesCount(jewels, stones);
		System.out.println(count);
	}

}
