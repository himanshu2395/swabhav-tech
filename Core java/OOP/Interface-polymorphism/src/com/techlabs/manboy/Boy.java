package com.techlabs.manboy;

public class Boy implements IMannerable, IEmotional {

	@Override
	public void cry() {
		System.out.println("cry due to emotional movie");

	}

	@Override
	public void laugh() {
		System.out.println("laugh as the movie is funny");
	}

	@Override
	public void wish() {
		System.out.println("Wish to");
	}

	@Override
	public void depart() {
		System.out.println("depart from");
	}

}
