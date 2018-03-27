package swabhav.techlabs;

public class Person {
	private int id;
	private int dob;
	private String address;

	public void person(int id, int dob, String address) {
		this.id = id;
		this.dob = dob;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public int getDob() {
		return dob;
	}

	public String getAddress() {
		return address;
	}

}
