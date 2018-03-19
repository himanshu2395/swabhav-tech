package swabhavtechlabs;

public class Account {
	private int accountno;
	private String name;
	private double balance;
	private static int count = 0;
	private static int nextaccount = 1001;
	private int withdraw;

	public Account(String name, double balance) {
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

	@Override
	public String toString() {

		return name + " " + balance + " " + accountno;
	}

	public double getBalance() {
		return balance;

	}

	public double deposit(int amount) {
		return balance += amount;

	}

	public int Withdraw(int amount) {
		double remainingBalance = balance - amount;
		if (remainingBalance > 0) {
			count++;
			balance = balance - amount;
		}
		return count;

	}

	public int getCountWithdrawl() {
		return count;
	}
}