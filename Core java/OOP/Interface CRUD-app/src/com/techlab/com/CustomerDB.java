package com.techlab.com;

public class CustomerDB implements ICRUD {

	@Override
	public void add() {
		System.out.println("Add Customer");
	}

	@Override
	public void create() {
		System.out.println("Create Customer");
	}

	@Override
	public void read() {
		System.out.println("Read Customer");
	}

	@Override
	public void select() {
		System.out.println("Select Customer");
	}

	@Override
	public void get() {
		System.out.println("Get Customer");
	}

}
