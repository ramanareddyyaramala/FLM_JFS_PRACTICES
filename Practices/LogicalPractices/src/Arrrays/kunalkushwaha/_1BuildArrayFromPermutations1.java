package Arrrays.kunalkushwaha;

import java.util.Arrays;

public class _1BuildArrayFromPermutations1 {
	
	public static int[] BuildArray(int[] nums) {
		int len=nums.length;
		int[] ans=new int[nums.length];
		for(int i=0;i<len;i++) {
			int valueArray=nums[nums[i]];
			ans[i]=valueArray;
		}
		return ans;
	}
	

	public static void main(String[] args) {
		int[] nums= {5,0,1,2,3,4};
		
		System.out.println(nums.length);
		
		int[] res= BuildArray(nums);
		
		System.out.println(Arrays.toString(res));
		
		
		
	}
	
}
