package com.engineeringanimuthyam;

public class NilabaddaScaleMuggu {
	
	public void nilabaddaScaleMuggu() {
		int row=15;
		int col=3;
		for(int i=0;i<15;i++) {
			for(int j=0;j<3;j++) {
				
				if(j==col-1) {
					System.out.print("*");
				}else {
					System.out.print("*_");
				}
				
				
			}
			System.out.println();
		}
	}
	
	
	public static void main(String[] args) {
		new NilabaddaScaleMuggu().nilabaddaScaleMuggu();
	}
}
