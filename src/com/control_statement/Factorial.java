package com.control_statement;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {

		int fact = 1;
		int i = 1;

		System.out.println("Enter Number :");

		Scanner s = new Scanner(System.in);

		int num = s.nextInt();

		/*
		 * while (i <= num) {
		 * 
		 * fact = fact * i;
		 *  i++;
		 * 
		 * }
		 */

		for (i = 1; i <= num; i++) {
			fact = fact * i;
		}

		s.close();
		System.out.println("Factorial :" + fact);

	}

}
