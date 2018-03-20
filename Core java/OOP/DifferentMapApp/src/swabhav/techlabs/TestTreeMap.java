package swabhav.techlabs;

import java.util.Map;
import java.util.TreeMap;

public class TestTreeMap {

	public static void main(String[] args) {

		TreeMap<Integer, String> hm = new TreeMap<Integer, String>();
		hm.put(100, "Amit");
		hm.put(102, "Ravi");
		hm.remove(102);
		hm.put(101, "Vijay");
		System.out.println(hm.isEmpty());
		hm.put(103, "Rahul");
		for (Map.Entry m : hm.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}
}
