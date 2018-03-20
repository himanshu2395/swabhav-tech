package human.test;

import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.techlabs.human.Human;

public class HumanTreeSet {

	public static void main(String[] args) {
		Human h1 = new Human(101, "Abc");
		Human h2 = new Human(101, "Abc");
		Set<Human> set = new TreeSet<Human>();
		set.add(h1);
		set.add(h2);
		System.out.println(h1.hashCode());
		System.out.println(h2.hashCode());
		System.out.println(h1.hashCode() == h2.hashCode());
		System.out.println(h1.name.equals(h2.name));
		for (Human st : set) {
			System.out.println(st.age + " " + st.name);
		}

	}
}
