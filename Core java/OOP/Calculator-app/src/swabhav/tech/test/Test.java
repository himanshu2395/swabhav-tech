package swabhav.tech.test;

import swabhav.techlabs.Calculator;

public class Test {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		try {
			System.out.println(calc.add(-10, 20));
		} catch (RuntimeException ex) {
			System.out.println(ex.getMessage());

		}
		System.out.println("end of main");

	}
}
