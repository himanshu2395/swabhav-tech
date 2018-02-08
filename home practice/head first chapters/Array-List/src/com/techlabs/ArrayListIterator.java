package com.techlabs;

import java.util.*;

public class ArrayListIterator {

	public static void main(String[] args) {

		ArrayList<String> name = new ArrayList<String>();
		// ADDING
		name.add("Himanshu");
		name.add("Rahul");
		name.add("Manish");
		name.add("jyoti");
		name.add("Swati");
		name.add("neha");
		// RETRIVING
		System.out.println(name.get(1));

		// RETRIVING USING ITERATOR

		// Iterator<String> itr = name.iterator();
		// while (itr.hasNext()) {
		// System.out.println(itr.next());

		// INDEX FOR LOOP ITERATION

		for (int i = 0; i < name.size(); i++) {
			System.out.println(name.get(i));
		}
		System.out.println();

		// REMOVING NAME FROM A LIST

		name.remove(name.size() - 1);

		// This is Slow

		name.remove(0);

		// ITERATION N0.2

		for (String xyz : name) {
			System.out.println(xyz);
		}
	}
}
