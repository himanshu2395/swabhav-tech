package com.techlabs.evenpalindrome;

public class TestReturn {

	public static void main(String[] args) {
		int[] EvenNos = getEvenNos(100, 200);
		System.out.println();

	}

	static int[] getEvenNos(int i, int j) {
		int[] EvenNos = new int[100];
		for (int k = i; k <= j; k++) {
			while (i <= j) {
				if (i % 2 == 0) {
					EvenNos[k] = i;
				}
				i++;
			}
		}
		return EvenNos;
		
	}
}
