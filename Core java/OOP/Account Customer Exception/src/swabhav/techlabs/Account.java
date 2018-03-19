package swabhav.techlabs;

public class Account {
	private int accountno;
	private String name;
	private int balance;
	private static int nextaccount = 1001;
	private int withdraw;

	public Account(String name, int balance) {
		this.name = name;
		this.balance = balance;
		accountno = nextaccount;
		nextaccount++;

	}

	public int getAccountno() {
		return accountno++;
	}

	public String getName() {
		return name;
	}

	public int getBalance() {
		return  balance;

	}

	public double deposit(int amount) {
		return balance = balance + amount;

	}

	public void Withdraw(int amount) {
		int remainingBalance = balance - amount;
		if (remainingBalance > 1000) {

			balance = balance - amount;
		}

		else {
			throw new InsuficientFundException(amount, remainingBalance);

		}

	}

}
