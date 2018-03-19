package swabhav.techlabs;

public abstract class Account {
	private int account;
	private String name;
	protected static int countwithdrawl = 0;
	protected double balance;
	protected static int countdeposit = 0;

	public Account(int account, String name, double balance) {
		this.account = account;
		this.name = name;
		this.balance = balance;
	}

	public int getAccount() {
		return account;
	}

	public String getName() {
		return name;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(int amount) {
		countdeposit = countdeposit + 1;
		balance += amount;

	}

	public int getCountwithdrawl() {
		return countwithdrawl;

	}

	public int getCountDeposit() {
		return countdeposit;
	}

	public abstract void withdraw(int amount);
}
