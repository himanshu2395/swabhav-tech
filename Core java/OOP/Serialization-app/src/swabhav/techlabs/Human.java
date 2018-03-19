package swabhav.techlabs;

public class Human implements java.io.Serializable {
	public String name;
	private String gender;
	public int age;
	public double weight;
	private float height;

	public void setAge(int parmAge) {
		if (parmAge > 18 && parmAge < 80) {
			age = parmAge;
		}
		if (parmAge <= 18) {
			age = 18;
		}
		if (parmAge >= 80) {
			age = 80;
		}
	}

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}

	public int getAge() {
		return age;

	}

	public void setWeight(float parmWgh) {
		if (parmWgh > 60.00 && parmWgh < 85.00) {
			weight = parmWgh;
		} else if (parmWgh <= 60) {
			weight = 60;
		} else if (parmWgh >= 85) {
			weight = 85;
		}
	}

	public double getWeight() {
		return weight;
	}

	public void setHeight(float parmHgh) {
		if (parmHgh > 155.00 && parmHgh < 190.00) {
			height = parmHgh;
		}
		if (parmHgh <= 155) {
			height = 155;
		}
		if (parmHgh >= 190) {
			height = 190;
		}
	}

	public float getHeight() {
		return height;
	}

	public void setGender(String pergender) {

		if (pergender.toUpperCase().equals("MALE")) {
			gender = pergender.toUpperCase();
		} else if (pergender.toUpperCase().equals("FEMALE")) {
			gender = pergender.toUpperCase();

		}

	}

	public String getGender() {
		return gender;
	}

	public void play() {

		weight = weight - 0.5;

	}

}