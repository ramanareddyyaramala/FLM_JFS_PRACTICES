package com.engineeringanimuthyam;

public class PadukuneScaleBokkaMuggu {
	
	public void padukuneScalebokkamuggu(){
		int rows=5;
		int col=15;
		for(int i=0;i<rows;i++) {
			for(int j=0;j<col;j++) {
				
				
				if(i==0 || i==rows-1 || j==0 ||j==col-1) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
				
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		new PadukuneScaleBokkaMuggu().padukuneScalebokkamuggu();
	}
	
}
