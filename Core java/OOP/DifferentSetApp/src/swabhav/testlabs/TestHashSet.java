package swabhav.testlabs;

import java.util.HashSet;

public class TestHashSet {

	public static void main(String[] args) {
		HashSet<Integer> hset = new HashSet<>();

		hset.add(19);
		hset.add(2);
		hset.add(3);
		hset.add(7);
		hset.add(4);
		hset.add(5);
		hset.add(6);
		hset.add(10);
		hset.add(1);

		for (Integer value : hset) {
			System.out.println(value);
		}
	}
}
