package com.techlabs.student;

public class Student {
	private int rollno;
	private String firstName;
	private String lastName;
	private float cgpa;
	private GenderOption gender;

	public Student(int rollno, String firstname, String lastName, float cgpa, GenderOption gender) {
		this.rollno = rollno;
		this.firstName = firstname;
		this.lastName = lastName;
		this.cgpa = cgpa;
		this.gender = gender;
		System.out.println("insert constructor 2");

	}

	public Student() {
		System.out.println("Insert constructor 1");
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public int getRollno() {
		return rollno;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setCgpa(float cgpa) {
		if (cgpa > 1 && cgpa < 10) {
			this.cgpa = cgpa;
		} else if (cgpa > 10) {
			this.cgpa = 11;
		} else if (cgpa < 1) {
			this.cgpa = 1;
		}

	}

	public float getCgpa() {
		return cgpa;
	}

	public void setGender(GenderOption gender) {
		this.gender = gender;
	}

	public GenderOption getGender() {
		return gender;
	}

	public String getFullName() {
		return firstName + " " + lastName;

	}

	public float getConvertCgpaToPercent() {
		return cgpa * (9.5f);
	}

}
