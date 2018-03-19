package swabhav.testlabs.test;

import java.util.ArrayList;

import swabhav.techlabs.Human;

public class TestGenericArrayList {

	public static void main(String[] args) {
		ArrayList<Human> man = new ArrayList<Human>();
		man.add(new Human());
		//man.add("Himanshu");
		for (Human x : man) {
			System.out.println(x);

		}

	}

}
