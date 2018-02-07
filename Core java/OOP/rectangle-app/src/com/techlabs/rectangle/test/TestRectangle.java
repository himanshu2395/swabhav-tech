package com.techlabs.rectangle.test;

import com.techlabs.rectangle.Rectangle;

public class TestRectangle {

	public static void main(String[] args) {

		Rectangle r1 = new Rectangle();
		r1.setHeight(11);
		r1.setWidth(21);
		System.out.println(r1.getWidth());
		System.out.println(r1.getHeight());
		System.out.println(r1.claculateArea());

	}

}
