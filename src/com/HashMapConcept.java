package com;

import java.util.HashMap;

public class HashMapConcept {

	// Hashamap is mapped based collection to store the values in key and value
	// pair

	public static void main(String[] args) {

		HashMap<Integer, String> hmap = new HashMap<Integer, String>();
		hmap.put(1, "Kaushalya");
		hmap.put(2, "sheetal");
		hmap.put(3, "Snehal");
		hmap.put(4, "Suyash");
		hmap.put(5, "Maddy");

		System.out.println(hmap.get(3));
		System.out.println(hmap);
		hmap.remove(5);
		System.out.println(hmap);
		System.out.println("size of Hashmap: " + hmap.size());

		// If I want to all keys in the hashmap.
		for (Integer i : hmap.keySet()) {
			System.out.println("The key is: " + i);
		}
		for (String i : hmap.values()) {
			System.out.println("The key is: " + i);
		}

		for (Integer j : hmap.keySet()) {
			System.out.println("key: " + j + " Values: " + hmap.get(j));
		}
	}

}
