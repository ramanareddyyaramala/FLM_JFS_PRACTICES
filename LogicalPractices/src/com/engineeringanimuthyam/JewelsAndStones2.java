package com.engineeringanimuthyam;

public class JewelsAndStones2 {
	
	public int JewelsStonesCount(String jewels,String stones) {
		
			int len=stones.length();
			int len2=jewels.length();
						int count=0;
						
			for(int i=0;i<len;i++) {
				char ch=stones.charAt(i);
				boolean found=false;
				for(int j=0;j<len2;j++) {
					char ch1=jewels.charAt(j);
					
					if(ch==ch1) {
						found=true;
						break;
					}
					
					
				}
				if(found==true) {
					count=count+1;
				}
				
			}
			
			return count;
										//getting wrong answer for this..
	}
	
	public static void main(String[] args) {
		String jewels="Aa";
		String stones="aAaAcc";
		JewelsAndStones2 obj=new JewelsAndStones2();
		int count=obj.JewelsStonesCount(jewels, stones);
		System.out.println(count);
	}

}
