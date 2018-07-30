package com.techlabs.overloading;

public class TestAdd {

	public static void main(String[] args) {
		 add();
		add(30, 40);
		 roundof((float) 5.6);
	            roundof((float) 7.3);
		 roundof((float) 8.4);
		 System.out.println("is 10 even?" + iseven(10));
		 System.out.println("is 115 even?" + iseven(115));
		printEven(100, 210);
		 printEven(100);
		System.out.println(isPalindrome(202));

	}

	private static boolean isPalindrome(int number) {
		int reverse = 0, remainder, originalInteger;

		originalInteger = number;

		while (number != 0) {
			remainder = number % 10;
			reverse = reverse * 10 + remainder;
			number /= 10;
		}

		if (originalInteger == reverse) {
			return true;
		} else {
			return false;
		}
	}

	static void printEven(int start, int end) {
		int count = 0;

		while (start <= end) {
			start++;
			if (start % 2 == 0) {
				count++;
				System.out.println(start + " ");
				if (isPalindrome(start)) {
					System.out.println("number is palindrome" + start);
				}

			}
		}
		System.out.println("Numbers are present in between=" + count);
		System.out.println();
	}

	static void printEven(int start) {
		int count = 0;
		while (start <= 300) {
			start++;
			if (start % 2 == 0) {
				count++;
				System.out.println(start + " ");
			}
		}
		System.out.println("Numbers are present in between=" + count);
	}

	static boolean iseven(int i) {
		if (i % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

	static void roundof(float d) {
		int y;
		y = (int) (d + .5);
		System.out.println(y);

	}

	static void add() {
		int a = 10;
		int b = 20;
		System.out.println("Adding a and b=" + (a + b));
		System.out.println("overloading #1");

	}

	static void add(int a, int b) {
		System.out.println("adding a and b=" + (a + b));
		System.out.println("overloading #2");
	}

}
