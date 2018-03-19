package swabhav.testlabs.test;

import java.util.ArrayList;

import swabhav.techlabs.Human;

public class TestArrayList {

	public static void main(String[] args) {
		ArrayList manyHuman = new ArrayList();

		manyHuman.add(new Human());
		manyHuman.add(new Human());

		manyHuman.add("Himanshu");

		for (Object x : manyHuman) {
			Human h = (Human) x;
			System.out.println(h.getAge());

		}

	}

}
