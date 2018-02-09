package swabhavtechlabs;

public class Account {
	private int accountno;
	private String name;
	private double balance;
	private static int nextaccount = 1001;

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

	public void deposit(int amount) {
		balance += amount;
	}

	public void Withdral(int amount) {
		double temp = balance - amount;
		if (temp > 0) {
			balance = balance - amount;
			// System.out.println(balance);
		} else {
			System.out.println("Minimum fund reached");
		}

	}
}
