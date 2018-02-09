package swabhav.techlabs.test;

import swabhav.techlabs.Customer;

public class CustomerTest {

	public static void main(String[] args) {
		Customer c1 = new Customer("rahul", 1500);
		Customer c2 = new Customer("manish", 2000);
		Customer c3 = new Customer("A", 500);
		Customer c4 = new Customer("A", 500);
		

		printDetails(c2);
		printDetails(c1);

		System.out.println(c3.equals(c4));

		System.out.println(c3.hashCode());
		System.out.println(c4.hashCode());

	}
	
		
	

	static void printDetails(Customer c) {
		// System.out.println(c.getName());
		System.out.println(c.getMoneySpent());
		System.out.println(c.getId());

	}

}
