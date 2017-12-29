package com.github.hemantsonu20.java9.factory;

import java.util.Map;
import java.util.Map.Entry;

/**
 * There are sets of factory methods for immutable maps in {@link Map} class. It
 * has of methods for 0 to 10 size map. Also it has
 * {@link Map#ofEntries(Entry...)} method to create immutable maps from
 * {@link Entry} objects.
 * 
 * @see Map#of()
 * @see Map#of(Object, Object)
 * @see Map#entry(Object, Object)
 * @see Map#ofEntries(Entry...)
 * 
 * @author hemantsonu20
 *
 */
public class MapFactory {

	public static void main(String[] args) {

		of0();
		of1();
		of2();
		of10();
		immutableCheck();
		noNullKeyOrValue();
		noDuplicateKey();
		ofEntries();
	}

	private static void of0() {

		Map<String, Integer> map = Map.of();
		print(map);
	}

	private static void of1() {

		Map<String, Integer> map = Map.of("One", 1);
		print(map);
	}

	private static void of2() {

		Map<String, Integer> map = Map.of("One", 1, "Two", 2);
		print(map);
	}

	private static void of10() {

		Map<String, Integer> map = Map.of("One", 1, "Two", 2, "Three", 3, "Four", 4, "Five", 5, "Six", 6, "Seven", 7,
				"Eight", 8, "Nine", 9, "Ten", 10);
		print(map);
	}

	private static void immutableCheck() {

		Map<String, Integer> map = Map.of("One", 1);

		try {
			map.put("Two", 2);
		} catch (UnsupportedOperationException e) {
			print("of factory methods create Immutable collections");
		}
	}

	/**
	 * {@link Map#of()} methods throw null pointer if any key or value is null
	 * 
	 */
	private static void noNullKeyOrValue() {

		try {
			Map.of("One", 1, null, 2);

		} catch (NullPointerException e) {
			print("no null keys are allowed in of factory methods");
		}
		try {
			Map.of("One", null);

		} catch (NullPointerException e) {
			print("no null values are allowed in of factory methods");
		}
	}

	private static void noDuplicateKey() {

		try {
			Map.of("One", 1, "One", 1);

		} catch (IllegalArgumentException e) {
			print("no duplicate keys are allowed in of factory methods");
		}
	}

	private static void ofEntries() {

		Map.Entry<String, Integer> entry1 = Map.entry("One", 1);
		Map.Entry<String, Integer> entry2 = Map.entry("Two", 2);

		Map<String, Integer> map = Map.ofEntries(entry1, entry2);
		print(map);
	}

	private static void print(Object obj) {

		System.out.println(obj);
	}
}
