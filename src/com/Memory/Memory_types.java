package com.Memory;

public class Memory_types {

	public static void main(String[] args) {

		System.out.println("-------IMMUTABLE------");

		String s = "babi";
		System.out.println(System.identityHashCode(s));

		String s1 = "babi";
		System.out.println(System.identityHashCode(s1));

		s = s + s1;
		System.out.println(System.identityHashCode(s));

		System.out.println("--------MUTABLE--------");

		StringBuffer a = new StringBuffer("babi");
		System.out.println(System.identityHashCode(a));

		StringBuffer a1 = new StringBuffer("babi");
		System.out.println(System.identityHashCode(a1));

		StringBuffer a2 = new StringBuffer(a = a.append(a1));
		System.out.println(System.identityHashCode(a2));

		StringBuffer a3 = new StringBuffer(a = a.append(a1));
		System.out.println(System.identityHashCode(a3));

	}
}
