package com.hyd.room.logical;

public class Patteran1 {

	public static void main(String[] args) {
		int row = 6;
		for (int i = 0; i < row; i++) {
			for(int j=row-i;j>1;j--){
				System.out.println();
			}
			for(int j=0;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
