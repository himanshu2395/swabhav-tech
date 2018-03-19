package swabhav.techlabs.test;

import swabhav.techlabs.Account;
import swabhav.techlabs.InsuficientFundException;

public class Test {

	public static void main(String[] args) {
		try {

			Account a1 = new Account("Himanshu", 1200);
			System.out.println("Acoount number = " + a1.getAccountno());
			System.out.println("name = " + a1.getName());
			a1.Withdraw(100);
			System.out.println("Balance =  " + a1.getBalance());

		} catch (InsuficientFundException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

}
