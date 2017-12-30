package com.github.hemantsonu20.java9.miscellaneous;

public class TryWithResources {

	public static void main(String[] args) throws Exception {

		java8();
		java9();
	}

	private static void java8() throws Exception {

		try (MyCloseable m1 = new MyCloseable(); MyCloseable m2 = new MyCloseable()) {
			// try block
		}
	}

	private static void java9() throws Exception {

		// object can be instantiated outside try, even in this case, close will be
		// called automatically
		MyCloseable m1 = new MyCloseable();
		MyCloseable m2 = new MyCloseable();
		try (m1; m2) {
			// try block
		}
	}

	public static class MyCloseable implements AutoCloseable {

		@Override
		public void close() throws Exception {

			System.out.println("close called");
		}
	}
}
