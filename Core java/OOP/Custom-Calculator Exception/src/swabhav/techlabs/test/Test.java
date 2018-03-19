package swabhav.techlabs.test;

import swabhav.techlabs.Calculator;
import swabhav.techlabs.NegativeNumberException;

public class Test {

	public static void main(String[] args) {
		Calculator ob = new Calculator();
		try {
			System.out.println(ob.add(-10, -20));
		}

		catch (NegativeNumberException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}

}
