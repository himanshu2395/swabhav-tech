package com.swabhav.techlabs;

public abstract class Employe {

	private int id;
	private String name;
	protected float basic;
	protected double total;

	public Employe(int id, String name, float basic) {
		this.id = id;
		this.name = name;
		this.basic = basic;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public float getBasic() {
		return basic;
	}

	@Override
	public abstract String toString();

	public abstract float totalSalary();

}
