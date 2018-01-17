package com.techlabs.overloading;

public class TestAdd {

	public static void main(String[] args) {
		// add();
		// add(30, 40);
		roundof((float) 5.6);
		roundof((float) 7.3);
		roundof((float) 8.4);
		System.out.println("is 10 even?" + iseven(10));

	}

	static boolean iseven(int i) {
		if (i % 2 == 0) {
		}
		return true;
	}

	static void roundof(float d) {
		int y;
		y = (int) (d + .5);
		System.out.println(y);

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
