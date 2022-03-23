package com.constructor;

public class Constructor_This {

	int id;
	String name;

	public Constructor_This() {

		System.out.println("Default Constructor");
		System.out.println(id + " " + name);
		System.out.println("-------------------");
	}

	public Constructor_This(int no, String name, int age) {

		this();
		System.out.println("No :" + no);
		System.out.println("Name :" + name);
		System.out.println("Age :" + age);
		System.out.println("-------------------");

	}

	public Constructor_This(long mobile) {

		this(1, "sree", 31);
		System.out.println(mobile);
		System.out.println("-------------------");
	}

	public Constructor_This(int salary) {

		this(9876543210l);
		System.out.println(salary);
		System.out.println("-------------------");
	}

	public static void main(String[] args) throws Throwable {

		Constructor_This c = new Constructor_This(65000);
		c.finalize();

	}

}
