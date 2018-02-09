package swabhavtechlabs.test;

import swabhavtechlabs.Account;

public class AccountTest {

	public static void main(String[] args) {

		Account a1 = new Account("manish", 5000);
		Account a2 = new Account("rahul", 1000);
		Account a3 = new Account("manisha", 50000);

		a1.deposit(10000);
		a2.deposit(2000);
		a3.deposit(30000);
		System.out.println();
		a1.Withdral(15000);

		printDetail(a1);
		printDetail(a2);
		printDetail(a3);

		System.out.println(a1.toString());
		System.out.println(a1);

	}

	private static void printDetail(Account a) {
		System.out.println("Acoount number = " + a.getAccountno());
		System.out.println("name = " + a.getName());
		System.out.println("Balance =  " + a.getBalance());
		System.out.println();

	}

}
