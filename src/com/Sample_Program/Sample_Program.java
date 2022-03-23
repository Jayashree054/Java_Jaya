package com.Sample_Program;

public class Sample_Program {

	public void name() {

		System.out.print(" Name :");
		System.out.println("Jayashree");

	}

	public void course() {

		System.out.print(" Course :");
		System.out.println("Selenium");

	}

	public void institute() {

		System.out.print(" Institute :");
		System.out.println("Greens");

	}

	public void timing() {

		System.out.print(" Timing :");
		System.out.println("8AM");

	}

	public static void main(String[] args) {

		System.out.println(" Student Detail");
		System.out.println("=================");

		Sample_Program s = new Sample_Program();

		s.name();
		s.course();
		s.institute();
		s.timing();

		
	}

}
