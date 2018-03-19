package swabhav.techlabs;

public class Calculator {

	public int add(int num1, int num2) {
		String s1 = "";
		String s2 = "";
		if (num1 < 0 || num2 < 0) {
			if (num1 < 0) {
				s1 = "	First number is negative" + num1;
			}
			if (num2 < 0) {
				s2 = "Second number is negative" + num2;
			}

			throw new RuntimeException("Negative number not supported" + " " + s1 + " " + s2);

		} else {
			int sum = num1 + num2;
			return sum;
		}
	}

}
