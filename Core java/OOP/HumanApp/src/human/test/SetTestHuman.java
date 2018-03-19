package human.test;

import java.util.HashSet;
import java.util.Set;

import com.techlabs.human.Human;

public class SetTestHuman {

	public static void main(String[] args) {
		Human s1 = new Human(101, "ab");
		Human s2 = new Human(101, "ab");

		Set<Human> set = new HashSet<>();
		set.add(s1);
		set.add(s2);

		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s1.hashCode() == s2.hashCode());
	}

}
