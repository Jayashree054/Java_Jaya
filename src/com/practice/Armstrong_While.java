package com.practice;

import java.util.Scanner;

public class Armstrong_While {

	public static void main(String[] args) {

		int n, a, i = 0, j = 0;

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number:");
		n = s.nextInt();
		a = n;

		while (a > 0) {

			i = a % 10;
			j = j + (i * i * i);
			a = a / 10;

		}
		if (n == j) {
			System.out.println("ArmStrong");
		} else {
			System.out.println("Not ArmStrong");

		}
	}

}
