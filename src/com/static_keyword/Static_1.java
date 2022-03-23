package com.static_keyword;

public class Static_1 {

	static int i = 100;
	static double a = 3.87d;

	private static void name() {

		System.out.println("Static Method");

	}
	public Static_1() { // constructor
	 
		System.out.println(" Static Default with Constructor");
	}
	
	static {

		System.out.println("Static Block");
	}

	public static void variable() {
		System.out.println("Static Variable :" + i);

	}

	public static void main(String[] args) throws Throwable {
		name();
		variable();
		System.out.println("Without in Method :"+a);
		
		Static_1 s = new Static_1();
		s.finalize();
	}
}
