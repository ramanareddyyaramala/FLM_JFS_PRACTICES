package com.engineeringanimuthyam;

public class MostWordsFound {
	
	public int MostwordsCount(String[] sentences) {
		
		int len=sentences.length;
		
		
		int ans=0;
		for(int i=0;i<len;i++) {
			String str=sentences[i];
			int slen=str.length();
			int count=1;
			for(int j=0;j<slen;j++) {
				
				char ch=str.charAt(j);
				
				if(ch==' ') {
					count=count+1;
				}
				
			}
			
			  if(count>ans) { ans=count; }
			 
		//	ans=Math.max(ans, count);
			
		}
		
		return ans;
		
	}
	
	
	public static void main(String[] args) {
		String[] sentences= {"I love you india","One should love their nation","Hardwork will never fail","r a m a n a r e d d y"};
		MostWordsFound m= new MostWordsFound();
		int res=m.MostwordsCount(sentences);
		System.out.println(res);
	}

}
