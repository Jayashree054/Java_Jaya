package com.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class List_Types {

	public static void main(String[] args) {

		List<Object> l = new LinkedList<Object>();
		List<Integer> a = new ArrayList<Integer>();
		List<Object> v = new Vector<Object>();

		l.add(1);
		l.add("Jayashree");
		l.add("F");
		l.add(234.65f);

		a.add(78);
		a.add(45);
		a.add(21);
		a.add(56);
		a.add(60);

		v.add(2);
		v.add("Babi");
		v.add("F");
		v.add("trl");
		v.add(47);
		v.add(976667.65f);

		System.out.println(l);
		System.out.println(a);
		System.out.println(v);

		int size = l.size();
		System.out.println("Size of Linked List :" + size);

		int s = a.size();
		System.out.println("Size of Array List :" + s);

		int i = v.size();
		System.out.println("Size of Vector List :" + i);

		Object obj = l.get(3);
		System.out.println("Object :" + obj);

		Object o = a.get(4);
		System.out.println("Object :" + o);

		Object b = v.get(1);
		System.out.println("Object :" + b);

		l.set(2, "v"); // replacce
		System.out.println("Replace:" + l);

		Object remove = v.remove(2);
		System.out.println("Remove:" + remove);
		System.out.println(v);

		int indexOf = a.indexOf(60);
		System.out.println("IndexOf in array:" + indexOf);

		boolean contains = v.contains("Babi");
		System.out.println("Contains:" + contains);

		l.addAll(a);
		System.out.println("AddAll List L in array :" + l);

		l.addAll(v);
		System.out.println("AddAll List L in vector :" + l);

		l.retainAll(v);
		System.out.println("Retain all :" + l);

		l.removeAll(a);
		System.out.println("Remove all :" + l);

		System.out.println(l);

		l.clear();
		System.out.println(l);

	}

}
