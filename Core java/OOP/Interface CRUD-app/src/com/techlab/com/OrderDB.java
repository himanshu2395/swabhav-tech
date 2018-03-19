package com.techlab.com;

public class OrderDB implements ICRUD {

	@Override
	public void add() {
		System.out.println("Add Order");
	}

	@Override
	public void create() {
		System.out.println("Create Order");
	}

	@Override
	public void read() {
		System.out.println("Read Order");
	}

	@Override
	public void select() {
		System.out.println("Select Order");
	}

	@Override
	public void get() {
		System.out.println("Get Order");

	}

}
