package com.Exception;

public class Exception_Arithmetic {
	
	public static void main(String[] args) {
		
		int a=20;
		
		try {
			System.out.println(a/0);
			
		} finally {
			System.out.println("Finally block");
		}
		
		
	}

}
