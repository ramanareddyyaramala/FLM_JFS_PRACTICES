package com.engineeringanimuthyam;

public class BikeStandMuggu {
	 	
	public void bikeStandMuggu() {
		int row=10;
		int col=5;
		for(int i=0;i<row;i++) {
			for(int j=i;j<row;j++) {
				System.out.print("  ");
			}
			for(int k=0;k<col;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		new BikeStandMuggu().bikeStandMuggu();
	}
	
}
