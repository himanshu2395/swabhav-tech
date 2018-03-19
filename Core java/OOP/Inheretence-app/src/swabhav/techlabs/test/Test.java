package swabhav.techlabs.test;

import swabhav.techlabs.Boy;
import swabhav.techlabs.Infant;
import swabhav.techlabs.Man;
import swabhav.techlabs.Toddler;

public class Test {

	public static void main(String[] args) {

		// case1();
		// case2();
		// case3();
		case4();
	}

	private static void case4() {
		atThePlayground(new Man());
		atThePlayground(new Boy());
		atThePlayground(new Infant());
		atThePlayground(new Toddler());

	}

	private static void atThePlayground(Man x) {
		System.out.println("In the Playground");
		x.play();

	}

	private static void case3() {
		Man x;
		x = new Boy();
		System.out.println("Case 3");
		x.read();
		x.walk();
		x.play();

	}

	private static void case2() {
		Boy y;
		y = new Boy();
		y.eat();
		y.read();
		y.walk();
		y.play();
		System.out.println();

	}

	private static void case1() {
		Man x;
		x = new Man();
		System.out.println("Case 1");
		x.read();
		x.walk();
		x.play();
		System.out.println();

	}

}
