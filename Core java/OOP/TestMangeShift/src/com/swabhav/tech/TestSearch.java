package com.swabhav.tech;

public class TestSearch {

	public static void main(String[] args) {
		int[] listofpincode = { 40001, 40002, 40003, 40004, 40004, 40005 };
		if (isPincodeFound(listofpincode, 40005)) {
			System.out.println("Found Pincode");
		} else {
			System.out.println("not Found");
		}
	}

	static boolean isPincodeFound(int[] listofpincode, int pincode) {
		for (int index = 0; index < listofpincode.length; index++) {
			if (listofpincode[index] == pincode)
				return true;
		}

		return false;
	}
}
