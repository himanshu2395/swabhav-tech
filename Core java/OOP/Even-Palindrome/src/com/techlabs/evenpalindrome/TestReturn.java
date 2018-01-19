package com.techlabs.evenpalindrome;

public class TestReturn {

	public static void main(String[] args) {
		int[] EvenNos = getEvenNos(100, 200);
		for (int i = 100; i < 202; i++) {
			System.out.println("EvenNos" + i + EvenNos[i]);
		}
		// int[] PalindromeNos=getPalindromeNos(100,200);
	}

	/*
	 * static int[] getPalindromeNos(int i, int j) { return null; }
	 */
	static int[] getEvenNos(int i, int j) {
		int[] EvenNos = new int[202];
		int[] actualEvenNos = new int[EvenNos.length];
		for (int k = i; k <= j; k++) {
			if (k % 2 == 0) {
				EvenNos[k] = k;
			}
		}
		for (int z = 0; z < EvenNos.length; z++) {
			if (EvenNos[z] != 0 && EvenNos[z] % 2 == 0) {
				actualEvenNos[z] = EvenNos[z];
			}
		}
		// System.out.println(actualEvenNos[0]);
		return actualEvenNos;
	}
}
