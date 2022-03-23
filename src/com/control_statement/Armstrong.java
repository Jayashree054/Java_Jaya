package com.control_statement;

import java.util.Scanner;

public class Armstrong {

	static boolean armstrong(int a) {

		int temp, digit = 0, last = 0, sum = 0;

		temp = a;

		while (temp > 0) {

			temp = temp / 10;
			digit++;

		}

		temp = a;

		while (temp > 0) {

			last = temp % 10;

			sum += (Math.pow(last, digit));

			temp = temp / 10;
		}

		if (a == sum)
			return true;

		else
			return false;

	}

	public static void main(String[] args) {

		System.out.println("Enter Number :");

		Scanner n = new Scanner(System.in);

		int num = n.nextInt();

		
		if (armstrong(num)) {
			
			System.out.println("ArmStrong");
			
		} else {

			System.out.println("Not ArmStrong");
		}
		
		n.close();
	}

}
