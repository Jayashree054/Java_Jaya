package com.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Map_Type {

	public static void main(String[] args) {

		Map<Integer, String> m = new HashMap<Integer, String>();

		m.put(1, "babi");
		m.put(2, "jaya");
		m.put(2, "b");
		m.put(null, "a");
		m.put(null, "45");
		m.put(7, null);

		System.out.println("Hash Map :" + m);

		int size = m.size();
		System.out.println("Size Of Hashmap :" + size);

		Set<Integer> keySet = m.keySet();
		System.out.println("KeySet :" + keySet);

		Collection<String> values = m.values();
		System.out.println("Values :" + values);

		boolean containsKey = m.containsKey(2);
		System.out.println("Contains Key :" + containsKey);

		boolean containsValue = m.containsValue("babi");
		System.out.println("Contains Value :" + containsValue);

		Set<Entry<Integer, String>> entrySet = m.entrySet();
		System.out.println(entrySet);

		for (Entry<Integer, String> i : entrySet) {
			System.out.println(i);
		}

		Map<Integer, String> t = new Hashtable<Integer, String>();

		t.put(2, "jaya");
		t.put(3, "sree");

		System.out.println("Hash Table :"+t);
	}

}
