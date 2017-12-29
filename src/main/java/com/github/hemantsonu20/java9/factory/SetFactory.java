package com.github.hemantsonu20.java9.factory;

import java.util.Set;

public class SetFactory {

	public static void main(String[] args) {

		of0();
		of1();
		of2();
		of10();
		ofArray();
		immutableCheck();
		noNullValue();
		noDuplicatesAsUsual();
	}

	private static void of0() {

		Set<String> set = Set.of();
		print(set);
	}

	private static void of1() {

		Set<String> set = Set.of("One");
		print(set);
	}

	private static void of2() {

		Set<String> set = Set.of("One", "Two");
		print(set);
	}

	private static void of10() {

		Set<String> set = Set.of("One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten");
		print(set);
	}

	private static void ofArray() {

		String[] arr = { "One", "Two" };
		Set<String> set = Set.of(arr);
		print(set);
	}

	private static void immutableCheck() {

		Set<String> set = Set.of("One", "Two");

		try {
			set.clear();
		} catch (UnsupportedOperationException e) {
			print("of factory methods create Immutable collections");
		}
	}

	private static void noNullValue() {

		try {
			Set.of("One", null, "Two", null);
		} catch (NullPointerException e) {
			print("no null values are allowed in of factory methods");
		}
	}

	private static void noDuplicatesAsUsual() {

		try {
			Set.of("One", "Two", "One");
		} catch (IllegalArgumentException e) {
			print("no duplicates are allowed in of factory methods");
		}
	}

	private static void print(Object obj) {

		System.out.println(obj);
	}
}
