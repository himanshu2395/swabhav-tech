package swabhavtechlabs.test;

import swabhavtechlabs.Account;

public class AccountTest {

	public static void main(String[] args) {

		Account a1 = new Account("Himanshu", 5000);
		Account a2 = new Account("rahul", 1000);
		Account a3 = new Account("manish", 5000);

		a1.deposit(100);
		a2.deposit(100);
		a3.deposit(100);
		System.out.println();
		a1.Withdraw(150);
		a2.Withdraw(200);
		a3.Withdraw(100);
		a1.Withdraw(100);
		System.out.println("Total number of times withdrawl happen = " + " " + a1.getCountWithdrawl());

		printDetail(a1);
		printDetail(a2);
		printDetail(a3);

		Account[] accountholder = new Account[3];
		accountholder[0] = new Account("manish", 5000);
		accountholder[1] = new Account("rahul", 1000);
		accountholder[2] = new Account("manish", 5000);
		System.out.println(accountholder[0].equals(accountholder[2]));

		for (int i = 0; i < accountholder.length; i++) {
			System.out.println(accountholder[i]);
		}

	}

	private static void printDetail(Account a) {
		System.out.println("Acoount number = " + a.getAccountno());
		System.out.println("name = " + a.getName());
		System.out.println("Balance =  " + a.getBalance());

	}

}
