package com.techlabs.overloading;

public class TestAdd {

	public static void main(String[] args) {
		add();
		add(30, 40);

	}

	static void add() {
		int a = 10;
		int b = 20;
		System.out.println("Adding a and b=" + (a + b));
		System.out.println("overloading #1");

	}

	static void add(int a, int b) {
		System.out.println("adding a and b=" + (a + b));
		System.out.println("overloading #2");
	}

}
