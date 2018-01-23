package com.swabhav.tech;

import java.util.Arrays;

public class TestShifing {

	public static void main(String[] args) {
		int[] nos = { 10, 20, 30, 40 };
		int[] shifftnos = shiftonce((nos));
		System.out.println(Arrays.toString(shifftnos));

	}

	static int[] shiftonce(int[] nos) {
		int shifftnos[] = new int[nos.length];
		shifftnos[shifftnos.length-1] = nos[0];
		for(int i=1;i<nos.length;i++)
			shifftnos[i-1]=nos[i];

		return shifftnos;
	}
}
