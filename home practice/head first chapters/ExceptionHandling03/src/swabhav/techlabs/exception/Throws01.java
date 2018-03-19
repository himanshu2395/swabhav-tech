package swabhav.techlabs.exception;

public class Throws01 {
	static void valid(int i) {
		if (i < 18) {
			throw new ArithmeticException("Not Valid");

		} else {
			System.out.println("valid");
		}
		System.out.println("welcome");
	}

	public static void main(String[] args) {
		try {
			valid(17);
		} catch (ArithmeticException e) {
			System.out.println("not possible : " + e);

		}

	}
}
