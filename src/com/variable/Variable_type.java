package com.variable;

public class Variable_type {

	final int i = 78;

	static float f = 2343.8f;

	// int i= 45;
	public void local() {

		int i = 188;
		System.out.println("Local varaiable inside Method :" + i);

	}

	public static void main(String[] args) {

		Variable_type v = new Variable_type();

		v.local();

		System.out.println(" static :" + f);

		System.out.println(" Class Varaiable :" + v.i);

	}

}
