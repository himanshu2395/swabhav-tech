package com.techlabs.manboy;

public class Man implements IMannerable {

	@Override
	public void wish() {
		System.out.println("Wish");

	}

	@Override
	public void depart() {
		System.out.println("Depart");
	}

}
