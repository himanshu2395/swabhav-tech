package com.swabhav.tech;

public class TestMax {

	public static void main(String[] args) {
		int[] numbers = { 10, 20, 80, 7, 31, 15, 93 };
		int[] max = findMaxOddEven(numbers);
		System.out.println(max[0]);
		System.out.println(max[1]);

	}

	static int[] findMaxOddEven(int[] numbers) {
		int[] max = new int[2];
		int high = numbers[0];
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 2 == 0 || (numbers[i] > high)) {
				high = numbers[i];
				max[0] = high;
			} else {
				max[1] = high;
			}
		}
		return max;
	}
}
