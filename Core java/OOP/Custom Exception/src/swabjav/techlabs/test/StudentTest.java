package swabjav.techlabs.test;

import swabhav.techlabs.HimanshuException;
import swabhav.techlabs.StudentManager;

public class StudentTest {

	public static void main(String[] args) {
		StudentManager ob = new StudentManager();
		try {
			StudentManager student = ob.find("10101010");
		} catch (HimanshuException ex) {
			System.out.print(ex);
		}

	}

}
