package com.techlabs.rectangle;

public class Rectangle {
	private int height;
	private int width;

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public int claculateArea() {
		return height * width;

	}

	public void setHeight(int h) {
		height = convertToValidRange(h);
	}

	public void setWidth(int h) {
		width = convertToValidRange(h);
	}

	private int convertToValidRange(int h) {
		if (h > 10 || h < 100) {
			if (h <= 10) {
				h = 10;
			}
			if (h >= 100) {
				h = 100;
			}
		}
		return h;
	}

}
