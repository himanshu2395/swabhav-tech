package com.techlabs.array;

public class ArrayPrint {

	public static void main(String[] args) {

		int[] numbers = new int[] { 101, 121, 130, 445, 153, 80, 50, 111, 117, 123, 6 };
		 printMaximumNumbers(numbers);
		// printMaxAndSeconMax(numbers);
		 printNumberDigit(3000);
		 printNumberDigit(32);
		// printNumberDigit(55555);
		// printOddNumber(numbers);
		// printEvenNumber(numbers);
	//	printNoReverse(102);
	//	printNoReverse(203);
	//	printNoReverse(5043);

	}

	static void printNoReverse(int i) {
		int reverse = 0;
		while (i != 0) {
			reverse = (reverse * 10) + (i % 10);
			i = i / 10;

		}
		System.out.println(reverse);

	}

	static void printEvenNumber(int[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 2 == 0) {
				System.out.println("even number =" + numbers[i]);

			}

		}

	}

	static void printOddNumber(int[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 2 != 0) {
				System.out.println("odd no=" + numbers[i]);

			}

		}

	}

	static void printNumberDigit(int i) {
		int a = 0;

		while (i != 0) {
			i = i / 10;
			a++;
		}

		System.out.println("Number of digits: " + a);

	}

	static void printMaximumNumbers(int[] numbers) {
		int max = numbers[0];
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > max) {
				max = numbers[i];
			}
			System.out.println(numbers[i]);
		}
		System.out.println("max is" + max);

	}

	static void printMaxAndSeconMax(int[] numbers) {

		int max = numbers[0];
		int scndmax = numbers[1];
		if (max > scndmax) {
			max = scndmax;
		}

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > max) {
				scndmax = max;
				max = numbers[i];
			} else if (numbers[i] > scndmax) {

				scndmax = numbers[i];
			} else if (numbers[i] > max) {
				max = scndmax;

			}

		}

		System.out.println("Maximum number is" + max);
		System.out.println("second Maximum number is" + scndmax);
	}

}
