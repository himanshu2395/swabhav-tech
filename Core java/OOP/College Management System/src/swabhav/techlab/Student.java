package swabhav.techlab;

import swabhav.techlabs.Person;

public class Student extends Person {

	  Branch  Branch;

	@Override
	public void person(int id, int dob, String address) {
		super.person(id, dob, address);
		this.Branch=Branch;
	}

	}


