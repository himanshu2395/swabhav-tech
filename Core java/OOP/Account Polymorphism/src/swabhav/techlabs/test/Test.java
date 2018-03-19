package swabhav.techlabs.test;

import swabhav.techlabs.Account;
import swabhav.techlabs.CurrentAccount;
import swabhav.techlabs.SavingAccount;

public class Test {

	public static void main(String[] args) {
		Account a1 = new CurrentAccount(1344549, "himanshu", 1500);
		Account a2 = new SavingAccount(1344540, "Sachin", 1000);

		a1.withdraw(22);
		a1.withdraw(10);
		a2.withdraw(30);
		a2.withdraw(50);

		a1.deposit(100);
		a1.deposit(200);
		a2.deposit(300);
		a2.deposit(100);

		printDetails(a1);
		printDetails(a2);
	}

	private static void printDetails(Account a) {
		System.out.println("account number = " + a.getAccount());
		System.out.println("name = " + a.getName());
		System.out.println("Balance = " + a.getBalance());
		System.out.println("Accros all account holder withdrawl =" + a.getCountwithdrawl());
		System.out.println("Accros all account holder deposit = " + a.getCountDeposit());

	}

}
