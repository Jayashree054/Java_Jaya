package com.scanner;

import java.util.Scanner;

public class Scanner_Method {

	public static void main(String[] args) {

		System.out.println("Scanner -> Getting value in console");

		Scanner s = new Scanner(System.in);

		
		System.out.println("Enter Name :");

		String name = s.nextLine(); // next line ->enter multiple line with space without press enter

		System.out.println();

		
		System.out.println("Enter Gender :");

		String gender = s.next(); // single word and to get scanner return type press ctrl+2,l

		System.out.println();

		
		System.out.println("Enter Age :");

		int age = s.nextInt(); // integer value

		System.out.println();

		
		System.out.println("Enter Salary :");

		float salary = s.nextFloat(); // float value

		System.out.println();

		
		System.out.println(" Employee name :" + name);
		System.out.println(" Employee Gender :" + gender);
		System.out.println(" Employee Age :" + age);
		System.out.println(" Employee Salary :" + salary);

		s.close(); // close for to stop leakage in scanner reference

	}

}
