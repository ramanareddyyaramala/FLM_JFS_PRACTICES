package Arrrays.kunalkushwaha;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class _10CheckIfTheSentenceIsPangram {
	
	public static boolean pangramCheck(String str) {
		
		int len=str.length();
		
		if(len<26) {
			return  false;
		}
		
		Set<Character> letters=new HashSet<>();
		
		for(char c:str.toCharArray()) {
			if(c>='a' && c<='z') {
			
				letters.add(c);
				
			}
		}
		
		return letters.size()>=26;
		
	}
	
	public static void main(String[] args) {
		//String str="thequickbrownfoxjumpsoverthelazydog";
		String str="abcddefjfjdhjfhbcdefghijklmnopqrstuvwxyz";
		String str1="abcdefghijklmnopqrstuvwxy";
		boolean status=pangramCheck(str1);
		System.out.println(status);
	}
	
}
