package com.swabhav.techlabs;

public class Developer extends Employe {
	private float projectallowence;

	public Developer(int id, String name, float basic) {
		super(id, name, basic);
		this.projectallowence = basic / 3;
	}

	@Override
	public float totalSalary() {
		float total;
		total = projectallowence + basic;
		return total;
	}

	@Override
	public String toString() {
		return "projectallowence " + projectallowence + "  " + " basic " + basic;
	}

}
