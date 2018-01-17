package com.swabhav.tech;

public class TestPrime {
	public static void main(String args[]) {
		boolean result = isprime(16);
		//System.out.println(result);
		printPrimeTill(50);

	}

	static void printPrimeTill(int n) {
		int flag = 0, i, j;
		for (i = 3; i < n; i++) {
		 if(isprime(i)) {
			 System.out.println("number is prime"+i);
		    }
		 }
		
	}

	static boolean isprime(int n) {
		int flag = 0, j;
		for (j = 2; j < n / 2; j++) {
			if (n % j == 0) {
				flag = 0;
				break;
			}
			flag = 1;
		}

		if (flag == 0) {
			return false;
		} else {
			return true;
		}

	}

}