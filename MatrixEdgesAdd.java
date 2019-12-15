package com.test;

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
