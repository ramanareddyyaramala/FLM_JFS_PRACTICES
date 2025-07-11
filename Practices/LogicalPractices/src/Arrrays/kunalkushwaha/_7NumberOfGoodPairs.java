package Arrrays.kunalkushwaha;

public class _7NumberOfGoodPairs {
	
	public static int numberOfGoodPairs(int arr[]) {
	
		int len=arr.length;
		int count=0;
		
		for(int i=0;i<len;i++) {
			
			for(int j=i;j<len;j++) {
				if(i<j && arr[i]==arr[j]) {
					count++;
				}
			}
			
		}
		return count;
		
	}
	
	public static void main(String[] args) {
		int arr[]= {1,2,3};
		int res=numberOfGoodPairs(arr);
		System.out.println(res);
	}
	
}
