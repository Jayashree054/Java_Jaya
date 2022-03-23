package com.control_statement;

public class If_Types {

	public static void main(String[] args) {

		int a = 10;

		if (a > 5) {

			System.out.println("value greater than 5");
		}

		System.out.println("*********if - else*********");

		int b = 2;

		if (b > 5) {

			System.out.println("greater 5");
		} else {

			System.out.println("lesser 5");
		}

		System.out.println("********* Else if ********");

		int c = 100;

		if (c < 5) {

			System.out.println("lessthan 5");
		}

		else if (c == 5) {
			System.out.println("equals to 5");

		}

		else if (c >= 10) {
			System.out.println("greaterthan 5");

		} else {
			System.out.println("Invalid");

		}

	}

}
