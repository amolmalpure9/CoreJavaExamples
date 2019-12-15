package com.test;

/*
This program is to add the numbers which are present on the edges of the matrix.

for ex. below is 3*3 matrix. Our program should add all the number present on the edges i.edges1st row
last row and 2 and 5 i.e. a[1][0] and a[1][2]

1 2 4
2 4 5
2 4 2

Note: this was asked in Amazon interview quetions

*/

public class MatrixEdgesAdd {

	public static void main(String[] args) {
		int sample = 2;
		int a[][] = new int[3][3];

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				a[i][j] = sample;
			}
		}

		int sum = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (i == 0 || i == 2) {
					sum += a[i][j];
				} else if (j == 0 || j == 2) {
					sum += a[i][j];
				}
			}
		}
		
		System.out.println("sum of edges of array: "+sum);
	}
}
