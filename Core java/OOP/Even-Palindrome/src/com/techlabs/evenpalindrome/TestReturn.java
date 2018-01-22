package com.techlabs.evenpalindrome;

import java.util.Arrays;

public class TestReturn {

	public static void main(String[] args) {

		// int[] evenNos = getEvenNos(10, 100);
		// for (int i = 0; i < evenNos.length; i++)
		// System.out.println(evenNos[i]);
		int[] palindromeNos = getPalindromeNos(202, 210);
		for (int i = 0; i < palindromeNos.length; i++)
			System.out.println(palindromeNos[i]);
	}

	static int[] getPalindromeNos(int start, int end) {
		int[] palindromeNos = new int[end - start + 1];
		int index = 0;
		int reverse = 0, remainder, originalInteger;

		originalInteger = start;
		while (start != 0) {
			remainder = start % 10;
			reverse = reverse * 10 + remainder;
			start = start / 10;
		}

		if (originalInteger == reverse) {
			palindromeNos[index] = reverse;
			index++;

		}
		return palindromeNos;
	}

	static int[] getEvenNos(int start, int end) {
		int[] evenNos = new int[end - start + 1];
		int index = 0;
		for (int k = start; k <= end; k++) {
			if (k % 2 == 0) {
				evenNos[index] = k;
				index++;
			}
		}
		return evenNos;
	}
}
