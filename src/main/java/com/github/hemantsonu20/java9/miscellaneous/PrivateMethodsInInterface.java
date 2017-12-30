package com.github.hemantsonu20.java9.miscellaneous;

public interface PrivateMethodsInInterface {

	// java 7
	void method1();

	// java 8, default methods
	default void method2() {
		// default implementation if not provided in implementing classes
		System.out.println("method2");
	}

	// java 8, static methods
	static void method3() {
		System.out.println("method3");
	}

	// java 9, private static methods
	private static void method4() {
		System.out.println("method4");
		
	}
	
	default void method4Call() {
		method4();
	}

	// java 9, private non-static methods
	private void method5() {
		System.out.println("method5");
	}
	
	default void method5Call() {
		method5();
	}
}
