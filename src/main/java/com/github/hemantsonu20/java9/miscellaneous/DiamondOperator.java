package com.github.hemantsonu20.java9.miscellaneous;

import java.util.concurrent.Callable;

public class DiamondOperator {

	public static void main(String[] args) throws Exception {

		java8();
		java9();
	}

	private static void java8() throws Exception {

		Callable<String> c = new Callable<String>() {

			@Override
			public String call() throws Exception {
				return "call";
			}
		};
		c.call();
	}

	/**
	 * Java 8 threw this error with this code
	 * 
	 * <pre>
	 *
	 * Callable<String> c = new Callable<>() {
	 *                                  ^
	 * reason: cannot use '<>' with anonymous inner classes
	 * where V is a type-variable:
	 * V extends Object declared in interface Callable
	 * 
	 * </pre>
	 * 
	 * @throws Exception
	 */
	private static void java9() throws Exception {

		Callable<String> c = new Callable<>() {

			@Override
			public String call() throws Exception {
				return "call";
			}
		};
		c.call();
	}
}
