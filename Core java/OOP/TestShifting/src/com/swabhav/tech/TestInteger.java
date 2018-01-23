package com.swabhav.tech;

public class TestInteger {

	public static void main(String[] args) {
		int no = 10;
		changeNumber(no);
		System.out.println(no);
		int[] nos = { 10, 20, 30, 40 };

		changeNumbers(nos);
		for (int i = 0; i < nos.length; i++)
			System.out.print(nos[i]);
		System.out.println(nos);

		int[] marks = { 100, 200, 300 };
		shiftMarks(marks);
		for (int i = 0; i < marks.length; i++) {
			System.out.println(marks[i]);
		}

	}

	private static void shiftMarks(int[] marks) {

	}

	static void changeNumbers(int[] nos) {
		System.out.println(nos);
		for (int i = 0; i < nos.length; i++) {
			nos[i] = 0;
		}

	}

	static void changeNumber(int no) {
		System.out.println("inside function");
		no = 0;

	}
}
