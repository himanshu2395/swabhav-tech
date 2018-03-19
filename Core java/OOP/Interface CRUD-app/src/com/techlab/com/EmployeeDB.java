package com.techlab.com;

public class EmployeeDB implements ICRUD {

	@Override
	public void add() {
		System.out.println("Add Employee");

	}

	@Override
	public void create() {
		System.out.println("Create Employee");
	}

	@Override
	public void read() {
		System.out.println("Read Employee");
	}

	@Override
	public void select() {
		System.out.println("Select Employee");

	}

	@Override
	public void get() {
		System.out.println("Get Employee");
	}

}
