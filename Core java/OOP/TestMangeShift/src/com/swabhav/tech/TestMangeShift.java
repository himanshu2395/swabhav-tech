package com.swabhav.tech;

public class TestMangeShift {

	public static void main(String[] args) {
		int[] nos = { 10, 20, 30, 40, 50 };
		shift(nos, 4);
		for (int e : nos) {
			System.out.println(e);
		}

	}

	static void shift(int[] nos, int noofshift) {
		int a;
		for (a = 0; a < noofshift; a++) {
		int temp1 = nos[0];
		for (int j = 0; j < nos.length - 1; j++) {
			nos[j] = nos[j + 1];
		}
		nos[nos.length - 1] = temp1;
	}
	}
	

}
