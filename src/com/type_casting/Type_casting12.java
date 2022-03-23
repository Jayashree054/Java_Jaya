package com.type_casting;

public class Type_casting12 {

	public static void main(String[] args) {

		System.out.println("Type Casting 1 : Widening");

		int i = 89;
		double d = (double) i;

		System.out.println("Small value integer :" + i);
		System.out.println(" Small to Big :" + d);
		
		System.out.println();
		
		System.out.println("Type Casting 2 : Narrowing");
		

		float f = 8989.765f;
		int a = (int) f;

		System.out.println("Big value float :" + f);
		System.out.println(" Big to small :"+a); 
				

	}

}
