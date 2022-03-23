package com.control_statement;

public class While_Types {

	public static void main(String[] args) {

		int a = 10;

		while (a >= 5) {

			System.out.println("Before :" + a);

			a--;

			System.out.println("After :" + a);
		}

		System.out.println("*****Do - while******");

		int b = 15;

		do {
			System.out.println("Before " + b);

			b--;

			System.out.println("After" + b);

		} while (b >= 10);

	}

}
