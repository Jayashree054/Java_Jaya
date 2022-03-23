package com.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set_Types {

	public static void main(String[] args) {

		Set<Character> s = new HashSet<Character>();

		// HashSet - Random order

		s.add('a');
		s.add('b');
		s.add('c');
		s.add(null);
		s.add(null);

		System.out.println("Hash Set :" + s);

		Set<Integer> l = new LinkedHashSet<Integer>();

		// linkedhashset -insertion

		l.add(3);
		l.add(5);
		l.add(null);
		l.add(3);
		l.add(null);

		System.out.println("LinkedHash Set :" + l);

		Set<Object> t = new TreeSet<Object>();

		t.add(31);
		t.add(99);
		t.add(31);
		t.add(2);
		

		try {
			t.add(null);

		} catch (Exception e) {

			System.out.println(e);

		}

		System.out.println("Tree Set :" + t);

	}

}
