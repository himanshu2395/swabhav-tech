package swabhav.test;

import java.util.Random;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		int x = 1;
		do {
			try {
				System.out.println("1-Start");
				System.out.println("2-Stop");
				System.out.println("Choose option: ");

				Scanner scan = new Scanner(System.in);
				int choice = scan.nextInt();
				Random rand = new Random();

				int rand_int1 = rand.nextInt(50);

				switch (choice) {
				case 1:
					for (int i = 1; i < 10; i++) {
						System.out.println("Enter your number : ");
						int a = scan.nextInt(){
						if (a == rand_int1) {
							System.out.println(" Match");
							break;

						} else if (a < rand_int1) {
							System.out.println("Too Low");

						} else if (a > rand_int1) {
							System.out.println("Too Large");

						}

						System.out.println("number remaining of attempt : " + (10 - i));
					}
					System.out.println("Game Over");

					break;

				case 2:
					System.out.println("THANK YOU");
					System.exit(0);
					break;

				}
			} catch (Exception e) {
				System.out.println("Wrong input. Try again.");
				e.printStackTrace();
			}
		} while (x == 1);
	}

}
