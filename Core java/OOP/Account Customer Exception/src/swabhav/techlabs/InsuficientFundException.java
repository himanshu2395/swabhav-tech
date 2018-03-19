package swabhav.techlabs;

public class InsuficientFundException extends RuntimeException {

	String s1 = "";
	String s2 = "";

	InsuficientFundException(int amount, int remainingBalance) {
		if (amount < 1000 || remainingBalance < 1000) {
			if (amount < 1000) {
				s1 = "amount cannot be less than 1000";
			}
			if (remainingBalance <= 1000) {
				s2 = "'\n'Remaining money cannot be less than or equal to 1000";
			}

		}
	}

	@Override
	public String getMessage() {
		return s1 +" "+ s2;

	}

}
