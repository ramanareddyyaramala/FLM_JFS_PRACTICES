package Arrrays.kunalkushwaha;

import java.util.Arrays;

public class _2ConcatenationArray2 {
	
	public static int[] concatenationArray(int nums[]) {
		int len=nums.length;
		int ans[]=new int[len*2];
		
			for(int i=0;i<len;i++) {
				ans[i]=nums[i];
			}
			for(int i=3;i<ans.length;i++) {
				ans[i]=nums[i-3];
			}
			return ans;
		
	}
		
	public static void main(String[] args) {
		int[] nums= {0,2,1};
	int[] res=	concatenationArray(nums);
	System.out.println(Arrays.toString(res));
	}
		
}
