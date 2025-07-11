package Arrrays.kunalkushwaha;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _6KidsWiththeGreatestNumberofCandies {
	
	public static List<Boolean> kidsWithGreatestNumberofCandies(int candies[],int n){
		
		int len=candies.length;
		List<Boolean> boolStatus=new ArrayList<>();
		for(int i=0;i<len;i++) {
			int value=candies[i]+n;
			
			String status=null;
			for(int j=0;j<len;j++) {
				
				if(value>=candies[j]) {
					 status="greater";
				}
				else {
					status="less";
					break;
				}
				
			}
			if(status.equals("greater")) {
				boolStatus.add(true);
			}
			else {
				boolStatus.add(false);
			}
			
		}
		return boolStatus;
	}

	public static void main(String[] args) {
		
		int candies[]= {12,1,12};
		int n=10;
		List<Boolean> res=kidsWithGreatestNumberofCandies(candies, n);
		System.out.println(res);

	}

}
