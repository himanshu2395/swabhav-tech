package swabhav.techlabs.test;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

import swabhav.techlabs.contactinformation.ContactInformation;

public class Test {

	public static void main(String[] args) {

		ArrayList<ContactInformation> contacts = new ArrayList<ContactInformation>(10);

		int exitcondition = 1;

		try {
			FileInputStream fis = new FileInputStream("D:\\file.csv");
			ObjectInputStream ois = new ObjectInputStream(fis);
			contacts = (ArrayList) ois.readObject();
			ois.close();
			fis.close();
			System.out.println("Object has been deserialized ");

		} catch (IOException ioe) {
			ioe.printStackTrace();

		} catch (ClassNotFoundException c) {
			System.out.println("Class not found");
			c.printStackTrace();
		}

		do {
			try {
				System.out.println("1-Add");
				System.out.println("2-Display");
				System.out.println("3-Exit");
				System.out.println("4-File Write");
				System.out.println("Choose option: ");

				Scanner scan = new Scanner(System.in);
				int choice = scan.nextInt();
				String fname = "";
				String mname = "";
				String lname = "";

				Long mnumber = new Long(0);

				switch (choice) {
				case 1:
					ContactInformation contactinfo = new ContactInformation();
					System.out.println("Enter first name :");
					fname = scan.next();
					contactinfo.setFirstname(fname);

					System.out.println("Enter Middsle Name :");
					mname = scan.next();
					contactinfo.setMiddlename(mname);

					System.out.println("Enter Last Name :");
					lname = scan.next();
					contactinfo.setLastname(lname);

					System.out.println("Enter the Mobile Number :");
					mnumber = scan.nextLong();
					contactinfo.setMobilenumber(mnumber);

					contacts.add(contactinfo);

					break;

				case 2:
					System.out.println(" Display Contract Information ");
					// System.out.println(contactinfo.toString());
					// System.out.println(contactinfo.getDisplayFullContactInformation());

					System.out.println("Enter " + contacts.size() + " info: ");
					for (ContactInformation contact : contacts)
						if (contact == null) {
						} else {
							System.out.println(contact.toString());
						}

					break;

				case 3:

					try {
						FileOutputStream fos = new FileOutputStream("D:\\file.csv");
						ObjectOutputStream oos = new ObjectOutputStream(fos);
						oos.writeObject(contacts);
						oos.close();
						fos.close();
						System.out.println("obeject have been serialized");
					} catch (IOException ioe) {
						ioe.printStackTrace();
					}

					exitcondition = 0;

					break;

				case 4:

					try {

						FileWriter writer = new FileWriter("D:\\file.csv");
						BufferedWriter bufferwriter = new BufferedWriter(writer);

						System.out.println("Enter " + contacts.size() + " info: ");
						for (ContactInformation contact : contacts)
							if (contact == null) {
							} else {
								bufferwriter.write(contact.getFirstname());
								bufferwriter.write(',');
								bufferwriter.write(contact.getMiddlename());
								bufferwriter.write(',');
								bufferwriter.write(contact.getLastname());
								bufferwriter.newLine();
							}

						bufferwriter.close();
						System.out.println("succesfully written to a file");

					} catch (IOException ioe) {
						ioe.printStackTrace();
					}

				}
			} catch (Exception e) {
				System.out.println("Wrong input. Try again.");
				e.printStackTrace();
			}
		} while (exitcondition == 1);
	}

}
