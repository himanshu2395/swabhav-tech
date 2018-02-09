package swabhav.techlabs;

public class Customer {
	private int id;
	private String name;
	private double moneyspent;
	private static int nextid;

	public Customer(String name, double moneyspent) {
		this.name = name;
		this.moneyspent = moneyspent;
		// nextid++;
		// id = nextid;

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object c4) {

		if (this == c4)
			return true;
		if (c4 == null)
			return false;
		if (this.getClass() != c4.getClass())
			return false;
		Customer that = (Customer) c4;
		if (this.name != that.name)
			return false;

		return true;
	}

	public double getMoneySpent() {
		return moneyspent;
	}

	public int getId() {
		return id;
	}
}
