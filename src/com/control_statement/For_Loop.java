package com.control_statement;

public class For_Loop {

	public static void main(String[] args) {
		
		for (int i = 0; i <3; i++) {
			
			System.out.println(i);
			
		}

		System.out.println("Nested For Loop");
		System.out.println("----------------");
		
		
		for (int i = 0; i < 10; i++) {

			for (int j = 0; j <= i; j++) {

				System.out.print(i);

			}
			System.out.println();
		}

	}

}
