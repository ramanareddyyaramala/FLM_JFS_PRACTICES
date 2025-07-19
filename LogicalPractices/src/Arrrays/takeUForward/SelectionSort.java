package Arrrays.takeUForward;

public class SelectionSort {
		
	public static int[] selectionSort(int arr[]) {
		int len=arr.length;
		
		for(int i=0;i<len;i++) {
			int min=i;
			for(int j=i;j<len;j++) {
				if(arr[i]<arr[min]) {
					
					min=j;
					
				}
			}
		}
		
	}
	
	public static void main(String[] args) {
		int arr[]= {5,4,3,2,1};
	}
	
}
