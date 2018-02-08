package com.techlabs;

import java.util.*;

public class ArrayListIterator {

	public static void main(String[] args) {

		ArrayList<String> name = new ArrayList<String>();
		name.add("Himanshu");
		name.add("Rahul");
		name.add("Manish");
		name.add("jyoti");
		name.add("Swati");
		name.add("neha");
		Iterator<String> itr = name.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
