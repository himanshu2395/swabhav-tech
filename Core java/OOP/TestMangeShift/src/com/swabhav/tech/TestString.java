package com.swabhav.tech;

public class TestString {

	public static void main(String[] args) {
		// String text = "radar";
		// text.toCharArray();
		// if (isPalindrome(text))
		// System.out.println("Text is palindrome");
		// else
		// System.out.println("Text is not palindrome");
		int count = findOcuranceOf('e', "helloworld");
		System.out.println(count);

	}

	static int findOcuranceOf(char c, String text) {
		char[] textarray = text.toCharArray();
		int count = 0;
		for (int i = 0; i < textarray.length; i++) {
			if (c == textarray[i]) {

				count++;

			}
		}

		return count;
	}
}

//
// static boolean isPalindrome(String text) {
// String reverse = "";
//
// for (int i = text.length() - 1; i >= 0; --i) {
// reverse = reverse + text.charAt(i);
// }
//
// if (reverse.equalsIgnoreCase(text)) {
//
// return true;
// } else
// return false;
//
// }
// }
