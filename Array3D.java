package com.test;

/*
This program is sample implementation of 3 dimentional array
3 dimentional array is nothing but array of 2 dimentional array
*/

public class Array3D {

	public static void main(String[] args) {
		int[][][] a = new int[2][3][3];
		int sample = 0;
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				for (int z = 0; z < 3; z++) {
					a[i][j][z] = ++sample;
				}
			}
		}
		
		for (int i = 0; i < 2; i++) {
			System.out.println("\n printing a["+i+"] position 2d matrix" );
			for (int j = 0; j < 3; j++) {
				for (int z = 0; z < 3; z++) {
					System.out.print("a["+i+"]["+j+"]["+z+"] => "+a[i][j][z]+" | ");
				}
				System.out.println("\n");
			}
		}
	}
}
