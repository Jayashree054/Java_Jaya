package com.string1;

public class Reverse_String {

	public static void main(String[] args) {

		String s = "shree", rev = "";

		char c;

		System.out.println("Given String :" + s);

		for (int i = 0; i < s.length(); i++) {

			c = s.charAt(i);

			rev = c + rev;

		}

		System.out.println("Reverse String :" + rev);

	}

}
