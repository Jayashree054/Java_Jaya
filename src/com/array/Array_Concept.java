package com.array;

public class Array_Concept {

	public static void main(String[] args) {

		System.out.println("Single Dimension Array");

		int a[] = new int[5];

		a[0] = 23;
		a[1] = 65;
		a[2] = 89;
		a[3] = 45;
		a[4] = 87;

		for (int i = 0; i < a.length; i++) {

			System.out.println(a[i]);
		}
		System.out.println("------------");

		int b[] = { 1, 2, 3, 4, 5, 6 };

		for (int i = 0; i < b.length; i++) {

			System.out.println(b[i]);
		}

		System.out.println("Multi Dimension Array");
		System.out.println();

		
		
		int c[][] = { { 23, 45 }, { 4, 5 } };

		for (int i = 0; i < 2; i++) {

			for (int j = 0; j < 2; j++) {

				System.out.println("arr[" + i + "][" + j + "]=" + c[i][j]);
			}

		}

	}

}
