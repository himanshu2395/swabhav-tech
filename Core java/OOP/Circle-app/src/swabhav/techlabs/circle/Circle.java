package swabhav.techlabs.circle;

public class Circle {
	private float radius;
	private float PI = (float) 3.14;
	private ColourType bgColour;

	public void setRadius(float h) {
		if (h > 0 || h < 1) {
			radius = h;
		}
		if (h <= 0) {
			radius = (float) .1;
		}
		if (h >= 1) {
			radius = (float) .9;
		}
	}

	public float getRadius() {
		return radius;

	}

	public float calculateArea() {
		float a;
		a = PI * radius * radius;

		return a;
	}

	public float calculateParameter() {
		float b;
		b = 2 * PI * radius;
		return b;
	}

	public void setColour(ColourType bgColour) {
		this.bgColour = bgColour;
	}

	public ColourType getbgColour() {
		return bgColour;

	}
	

}
