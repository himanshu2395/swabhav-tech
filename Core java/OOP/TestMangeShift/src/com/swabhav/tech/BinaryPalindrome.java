package com.swabhav.tech;

public class BinaryPalindrome {

	public static void main(String[] args) {
		int[] nos = { 1, 1, 0, 0, 1, 0};
		boolean result=isPalindrome(nos);
		System.out.println(result);

	}

	static boolean isPalindrome(int[] nos) {
		int length = nos.length;
		for (int index = 0; index < nos.length; index++) {
			int start = nos[index];
			int end = nos[--length];
			
			if (start != end) {
				return false;
			}
		}
		return true;
	}

}
