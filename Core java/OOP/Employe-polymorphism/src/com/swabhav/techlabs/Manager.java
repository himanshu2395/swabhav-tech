package com.swabhav.techlabs;

public class Manager extends Employe {
	private float travelAllowence;
	private float houseRentAllowance;

	public Manager(int id, String name, float basic) {
		super(id, name, basic);
		this.houseRentAllowance = basic/2;
		this.travelAllowence = basic / 2;
	}

	@Override
	public float totalSalary() {
		float total;
		total = (travelAllowence + houseRentAllowance + basic);
		return total;
	}

	@Override
	public String toString() {
		return "travelAllowence " + travelAllowence + " " + " houseRentAllowance " + houseRentAllowance + " "
				+ "  basic" + basic;
	}

}
