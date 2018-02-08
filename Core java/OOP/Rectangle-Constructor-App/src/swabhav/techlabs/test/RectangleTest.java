package swabhav.techlabs.test;

import swabhav.techlabs.BorderStyle;
import swabhav.techlabs.Rectangle;

public class RectangleTest {

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(21, 31, BorderStyle.Solid);
		Rectangle r2 = new Rectangle(31, 42, BorderStyle.Double);
		Rectangle r3 = new Rectangle(51, 62, BorderStyle.Single);

		Rectangle[] rectangles = new Rectangle[3];

		rectangles[0] = r1;
		rectangles[1] = r2;
		rectangles[2] = r3;
		printDetails(rectangles);
	}

	public static void printDetails(Rectangle[] rectangles) {
		for (int i = 0; i < rectangles.length; i++) {

			System.out.println("Width = " + rectangles[i].getWidth());
			System.out.println("Height = " + rectangles[i].getHeight());
			System.out.println("Border = " + rectangles[i].getBorder());
			System.out.println("Area of a Rectangle = " + rectangles[i].calcaulateArea());

		}

	}

}
