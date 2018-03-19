package swabhav.techlabs;

public class NegativeNumberException extends RuntimeException {
	String s1 = "";
	String s2 = "";

	public NegativeNumberException(int x, int y) {
		if (x < 0 || y < 0) {
			if (x < 0) {
				s1 = "First number is negative" + x;
			}
			if (y < 0) {
				s2 = "Second number is negative" + y;
			}

		}
	}

	@Override
	public String getMessage() {
		return s1 + s2;

	}
}
