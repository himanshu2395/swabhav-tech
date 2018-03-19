package swabhav.techlabs;

public class Calculator {
	public int add(int x, int y) {
		if (x > 0 && y > 0) {
			int sum = x + y;

			return sum;
		} else {
			throw new NegativeNumberException(x, y);
		}
	}

}
