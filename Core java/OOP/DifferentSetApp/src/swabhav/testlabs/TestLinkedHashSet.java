package swabhav.testlabs;

import java.util.LinkedHashSet;

public class TestLinkedHashSet {

	public static void main(String[] args) {
		LinkedHashSet<Integer> lhs = new LinkedHashSet<>(40);

		lhs.add(19);
		lhs.add(2);
		lhs.add(3);
		lhs.add(7);
		lhs.add(4);
		lhs.add(5);
		lhs.add(6);
		lhs.add(10);
		lhs.add(1);

		for (Integer value : lhs) {
			System.out.println(value);

		}
	}

}
