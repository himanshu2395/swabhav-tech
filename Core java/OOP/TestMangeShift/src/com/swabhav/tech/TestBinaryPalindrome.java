package com.swabhav.tech;

public class TestBinaryPalindrome {

	public static void main(String[] args) {

		int nos = 9;
		int[] binaryarray = convertToBinary(nos);
		for (int i = 0; i < binaryarray.length; i++) {
			System.out.print(binaryarray[i] + " ");
		}
		boolean result = isPalindrome(binaryarray);
		System.out.println(result);
	}

	static boolean isPalindrome(int[] binaryarray) {
		int length = binaryarray.length;
		for (int index = 0; index < binaryarray.length; index++) {
			int start = binaryarray[index];
			int end = binaryarray[--length];
			if (length < index) {
				return true;
			}
			if (start != end) {
				return false;
			}
		}
		return true;
	}

	static int[] convertToBinary(int nos) {
		int binaryarray[] = new int[6];
		int index = 0;
		while (nos > 0) {
			binaryarray[index++] = nos % 2;
			nos = nos / 2;
		}
		return binaryarray;
	}

}
