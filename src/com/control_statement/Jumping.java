package com.control_statement;

public class Jumping {

	private int value() {

		return 123244;

	}

	public static void main(String[] args) {

		Jumping j = new Jumping();

		System.out.println("Jump Statement - Return " + j.value());

		System.out.println("Jump Statement - Break ");

		for (int i = 0; i < 10; i++) {

			if (i == 5)

				break;
			System.out.println(i);

		}

		System.out.println("Jump Statement - continue ");

		for (int i = 0; i < 10; i++) {

			if (i == 5)

				continue;
			System.out.println(i);
		}

	}

}
