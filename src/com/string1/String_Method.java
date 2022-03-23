package com.string1;

public class String_Method {

	public static void main(String[] args) {

		String g = " Hi This is Jayashree!!";

		int l = g.length();
		System.out.println("Length :" + l);

		boolean e = g.equals(" hi this is jayashree!!");
		System.out.println("Equals :" + e);

		boolean i = g.equalsIgnoreCase(" hi this is jayashree!!");
		System.out.println("Ignore Case Sensitive :" + i);

		String u = g.toUpperCase();
		System.out.println("Change into Uppercase :" + u);

		String c = g.toLowerCase();
		System.out.println("Change into Lowercase :" + c);

		boolean t = g.startsWith("Hi");
		System.out.println("Starting value given in return type :" + t);

		boolean n = g.endsWith("!");
		System.out.println("Ending Value given in return value :" + n);

		boolean o = g.contains("a");
		System.out.println("contains - given value is in string :" + o);

		int a = g.indexOf("a");
		System.out.println("Index Of :" + a);

		int x = g.lastIndexOf("e");
		System.out.println("Last index Of :" + x);

		char r = g.charAt(22);
		System.out.println("Given Integer num what value is there :" + r);

		String p = g.replace("a", "*v*");
		System.out.println("Replace :" + p);

		String b = g.substring(16);
		System.out.println("Sub String :" + b);

		boolean m = g.isEmpty();
		System.out.println("Given String Value is Empty :" + m);

		String trim = g.trim();
		System.out.println("Triming the Value :" + trim);

		String[] d = g.split(" ");

		for (String z : d) {

			System.out.println(z);

		}

	}

}
