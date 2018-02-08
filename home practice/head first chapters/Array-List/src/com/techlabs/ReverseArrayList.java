package com.techlabs;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseArrayList {

	public static void main(String[] args) {
		ArrayList<String> name = new ArrayList<String>();
		name.add("Himanshu");
		name.add("rahul");
		name.add("mark");
		name.add("Patrik");
		name.add("jack");
		name.remove(3);
		// name.clear();
		name.add(0, "Swati");
		for (String x : name) {
			System.out.println(x);
		}
		System.out.println();
		Collections.reverse(name);
		System.out.println(name);
	}
}
