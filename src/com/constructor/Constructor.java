package com.constructor;

public class Constructor {

	int id;
	String name;

	public Constructor() {

		System.out.println("Default Constructor");
		System.out.println(id + " " + name);
		System.out.println("==================");
	}

	public Constructor(int no, String name, int age) {

		System.out.println("No :" + no);
		System.out.println("Name :" + name);
		System.out.println("Age :" + age);
		System.out.println("==================");

	}

	public Constructor(long mobile) {

		System.out.println(mobile);
		System.out.println("==================");
	}

	public Constructor(int salary) {

		System.out.println(salary);
	}

	public static void main(String[] args) throws Throwable {

		Constructor c = new Constructor();

		Constructor c1 = new Constructor(1, "shree", 31);

		Constructor c2 = new Constructor(9876543210l);

		Constructor c3 = new Constructor(55000);

		c.finalize();
		c1.finalize();
		c2.finalize();
		c3.finalize();
	}

}
