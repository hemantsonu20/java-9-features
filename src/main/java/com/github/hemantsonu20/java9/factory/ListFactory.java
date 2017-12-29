package com.github.hemantsonu20.java9.factory;

import java.util.List;

public class ListFactory {

	public static void main(String[] args) {

		of0();
		of1();
		of2();
		of10();
		ofArray();
		immutableCheck();
		noNullValue();
		duplicatesAllowedAsUsual();
	}

	private static void of0() {

		List<String> list = List.of();
		print(list);
	}

	private static void of1() {

		List<String> list = List.of("One");
		print(list);
	}

	private static void of2() {

		List<String> list = List.of("One", "Two");
		print(list);
	}

	private static void of10() {

		List<String> list = List.of("One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten");
		print(list);
	}

	private static void ofArray() {

		String[] arr = { "One", "Two" };
		List<String> list = List.of(arr);
		print(list);
	}

	private static void immutableCheck() {

		List<String> list = List.of("One", "Two");

		try {
			list.clear();
		} catch (UnsupportedOperationException e) {
			print("of factory methods create Immutable collections");
		}
	}

	private static void noNullValue() {

		try {
			List.of("One", null, "Two", null);
		} catch (NullPointerException e) {
			print("no null values are allowed in of factory methods");
		}
	}

	private static void duplicatesAllowedAsUsual() {

		List<String> list = List.of("One", "Two", "One");
		print(list);
	}

	private static void print(Object obj) {

		System.out.println(obj);
	}
}
