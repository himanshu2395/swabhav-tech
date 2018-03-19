package com.techlabs.bug;

public class StackTrace {

	public static void main(String[] args) {
		try {
			m1();

		} catch (RuntimeException ex) {
			ex.printStackTrace();

		}

		System.out.println("End of main ");

	}

	private static void m1() {
		System.out.println("Inside m1");
		m2();
	}

	private static void m2() {
		System.out.println("inside m2");
		m3();
	}

	private static void m3() {
		System.out.println("Inside m3");
		throw new RuntimeException("Something went wrong");
	}

}
