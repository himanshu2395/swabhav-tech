package com.techlabs.human;

import java.util.Objects;

public class Human implements Comparable<Human> {
	public String name;
	private String gender;
	public int age;
	private double weight;
	private float height;

	public Human(int age, String name) {
		this.age = age;
		this.name = name;
	}

	@Override
	public boolean equals(Object s1) {
		if (s1 == this)
			return true;
		if (!(s1 instanceof Human)) {
			return false;
		}
		Human s2 = (Human) s1;
		return age == s2.age && name.equals(s2);
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, name);
	}

	public Human() {
		// TODO Auto-generated constructor stub
	}

	public void setAge(int parmAge) {
		if (parmAge > 18 && parmAge < 80) {
			age = parmAge;
		}
		if (parmAge <= 18) {
			age = 18;
		}
		if (parmAge >= 80) {
			age = 80;
		}
	}

	public int getAge() {
		return age;

	}

	public void setWeight(float parmWgh) {
		if (parmWgh > 60.00 && parmWgh < 85.00) {
			weight = parmWgh;
		} else if (parmWgh <= 60) {
			weight = 60;
		} else if (parmWgh >= 85) {
			weight = 85;
		}
	}

	public double getWeight() {
		return weight;
	}

	public void setHeight(float parmHgh) {
		if (parmHgh > 155.00 && parmHgh < 190.00) {
			height = parmHgh;
		}
		if (parmHgh <= 155) {
			height = 155;
		}
		if (parmHgh >= 190) {
			height = 190;
		}
	}

	public float getHeight() {
		return height;
	}

	public void setGender(String pergender) {

		if (pergender.toUpperCase().equals("MALE")) {
			gender = pergender.toUpperCase();
		} else if (pergender.toUpperCase().equals("FEMALE")) {
			gender = pergender.toUpperCase();

		}

	}

	public String getGender() {
		return gender;
	}

	public void doWorkout() {

		weight = weight - 0.5;
	}

	@Override
	public int compareTo(Human o) {
		if (age == o.age)
			return 0;
		else if (age > o.age)
			return 1;
		else
			return -1;
	}
}
