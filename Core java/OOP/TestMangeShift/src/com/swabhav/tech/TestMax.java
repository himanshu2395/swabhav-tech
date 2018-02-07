package com.swabhav.tech;

public class TestMax {

	public static void main(String[] args) {
		int[] numbers = { 123, 147, 80, 7, 31, 90, 15, -93, -99, -123, -125, -126, -127 };
		int[] max = findMaxOddEven(numbers);
		System.out.println("max even nos=" + max[0]);
		System.out.println("max odd nos=" + max[1]);
		

	}

	static int[] findMaxOddEven(int[] numbers) {
		int[] max = new int[2];
		int Evenhigh = numbers[0];
		int Oddhigh = numbers[0];

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 2 == 0) {
				if (numbers[i] >= Evenhigh) {
					Evenhigh = numbers[i];
					max[0] = Evenhigh;
				}

			} else {

				if (numbers[i] > Oddhigh)
					Oddhigh = numbers[i];
				max[1] = Oddhigh;
			}
		}
		return max;
	}
}
