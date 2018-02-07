package swabhav.techlabs.circle.test;

import swabhav.techlabs.circle.Circle;
import swabhav.techlabs.circle.ColourType;

public class CircleTest {

	public static void main(String[] args) {

		Circle[] circle = new Circle[3];
		Circle c1 = null;
		circle[0] = c1;
		Circle c2 = null;
		circle[1] = c2;
		Circle c3 = null;
		circle[2] = c3;

		Circle circlename = new Circle();

		circlename.setRadius((float) 5);

		circlename.setColour(ColourType.Red);
		printDetails(circlename);

		Circle cirname = new Circle();

		cirname.setRadius(0);

		cirname.setColour(ColourType.Red);
		printDetails(circlename);

	}

	static void shift(Circle[] circle, int shiftnos) {

		int a;
		for (a = 0; a < shiftnos; a++) {
			Circle temp1 = circle[0];
			for (int j = 0; j < circle.length - 1; j++) {
				circle[j] = circle[j + 1];
			}
			circle[circle.length - 1] = temp1;
			printDetail(circle);
		}
	}

	public static void printDetails(Circle circle) {
		System.out.println("radius =" + circle.getRadius());
		System.out.println("Area is " + circle.calculateArea());
		System.out.println("colour is " + circle.getbgColour());
		System.out.println("Parameter is " + circle.calculateParameter());

	}

	public static void printDetail(Circle[] circle) {
		shift(circle, 2);
		for (Circle e : circle) {
			System.out.println(e);
		}

	}

}
