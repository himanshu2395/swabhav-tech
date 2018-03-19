package swabhav.techlabs.contactinformation;

import java.io.FileWriter;
import java.util.List;

public class ContactInformation implements java.io.Serializable{
	private String firstname;
	private String middlename;
	private String lastname;
	private long mobilenumber;
	public static int number = 0;

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public void setMobilenumber(long mobilenumber) {
		this.mobilenumber = mobilenumber;
	}

	public ContactInformation(String firstname, String middlename, String lastname, long mobilenumber) {
		this.firstname = firstname;
		this.middlename = middlename;
		this.lastname = lastname;
		this.mobilenumber = mobilenumber;

	}

	public ContactInformation() {
		// TODO Auto-generated constructor stub
	}

	public ContactInformation(FileWriter fileWriter, char c) {
		// TODO Auto-generated constructor stub
	}

	public String getFirstname() {
		return firstname;
	}

	public String getMiddlename() {
		return middlename;
	}

	public String getLastname() {
		return lastname;
	}

	public long getMobilenumber() {
		return mobilenumber;
	}

	public String getDisplayFullContactInformation() {

		return firstname + " " + middlename + " " + lastname + " " + mobilenumber;

	}

	@Override
	public String toString() {
		return "firstname: '" + this.firstname + "', mname: '" + this.middlename + "', lname:'" + this.lastname
				+ "mobilenumber'" + this.mobilenumber;
	}

}
