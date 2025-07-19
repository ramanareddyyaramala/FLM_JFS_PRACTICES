package Arrrays.kunalkushwaha;

public class _5RichestCustomerWealth {
	
	public static int richestCustomerWealth(int arr[][]) {
		int row=arr.length;
		int col=arr[0].length;
		int fsum=0;
		for(int i=0;i<row;i++) {
			int sum=0;
			for(int j=0;j<col;j++) {
				sum=sum+arr[i][j];
			}
			
			if(sum>fsum) {
				fsum=sum;
			}
			
		}
		
		return fsum;
	}
	
	public static void main(String[] args) {
		int arr[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int richestCustomerWealth=richestCustomerWealth(arr);
		System.out.println(richestCustomerWealth);
		
				}

}
