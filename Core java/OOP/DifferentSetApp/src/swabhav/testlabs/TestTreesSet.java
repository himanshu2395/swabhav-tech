package swabhav.testlabs;

import java.util.TreeSet;

public class TestTreesSet {

	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<Integer>();
		ts.add(19);
		ts.add(2);
		ts.add(3);
		ts.add(7);
		ts.add(4);
		ts.add(5);
		ts.add(6);
		ts.add(10);
		ts.add(1);

		for (Integer value : ts) {
			System.out.println(value);
		}

	}

}
