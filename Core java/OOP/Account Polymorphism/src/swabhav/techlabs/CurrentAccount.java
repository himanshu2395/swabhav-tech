package swabhav.techlabs;

public class CurrentAccount extends Account {

	public CurrentAccount(int account, String name, double balance) {

		super(account, name, balance);
	}

	@Override
	public void withdraw(int amount) {
		double remainingBalance = balance - amount;
		if (remainingBalance > -1000) {
			countwithdrawl=countwithdrawl+1;
			balance = balance - amount;
		} else {
			System.out.println("minimum balance reched");
		}
	}

	

}
