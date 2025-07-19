package com.engineeringanimuthyam;

public class PadukunnaScaleMuggu {
	
	public void padukunnascaleMuggu() {
		int row=3;
		int col=15;
		for(int i=0;i<3;i++) {
			for(int j=0;j<15;j++) {
				if (j==col-1) {
					System.out.print("*");
				}
				else {
					System.out.print("*_");
				}
				
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		new PadukunnaScaleMuggu().padukunnascaleMuggu();
	}

}
