package Arrrays.kunalkushwaha;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _9CreateTargetArrayInTheGivenOrder {
	
	public static int[] targetOrder(int[] nums,int[] index) {
		
		int len=nums.length;
		
		List<Integer> target=new ArrayList<>();
		
		for(int i=0;i<len;i++) {
			target.add(index[i], nums[i]);
		}
		//convert list into the array..
		int targetArray[]=new int[len];
		for(int j=0;j<len;j++) {
			targetArray[j]=target.get(j);
		}
		return targetArray;
	}
	
	public static void main(String[] args) {
		int[] nums = {0,1,2,3,4};
		
		int[] index = {0,1,2,2,1};
		
		int res[]=targetOrder(nums, index);
		
		System.out.println(Arrays.toString(res));
	}
	
}
