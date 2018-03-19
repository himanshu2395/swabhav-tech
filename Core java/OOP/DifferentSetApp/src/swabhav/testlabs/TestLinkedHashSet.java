package swabhav.testlabs;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class TestLinkedHashSet {

	public static void main(String[] args) {
		LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
		lhs.add(1);
		lhs.add(2);
		lhs.add(3);

		for (Integer value : lhs) {
			System.out.println(value);

		}
	}

}
