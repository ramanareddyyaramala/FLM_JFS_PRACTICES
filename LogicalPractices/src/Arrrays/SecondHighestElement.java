package Arrrays;

public class SecondHighestElement {
		public static int secondHighest(int[]arr) {
			int len=arr.length;
			int first=Integer.MIN_VALUE;
			int second=Integer.MIN_VALUE;
			
			for(int i=0;i<len;i++) {
				if(first<arr[i]) {
					second=first;
					first=arr[i];
				}
				else if(second<arr[i] && first>arr[i]) {
					
					second=arr[i];
				}
				
			}
			
			
			return second;
		}
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,9};
		int res=secondHighest(arr);
		System.out.println(res);
	}
}
