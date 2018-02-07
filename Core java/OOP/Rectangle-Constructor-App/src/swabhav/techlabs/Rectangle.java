package swabhav.techlabs;

public class Rectangle {
	private int width;
	private int height;
	private BorderStyle border;

	public Rectangle(int width, int height, BorderStyle border) {
		this.width = width;
		this.height = height;
		this.border = border;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;

	}

	public BorderStyle getBorder() {
		return border;

	}

	public int calcaulateArea() {
		return height * width;

	}

}
