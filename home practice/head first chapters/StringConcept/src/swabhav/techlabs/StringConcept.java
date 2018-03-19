package swabhav.techlabs;

public class StringConcept {

	public static void main(String[] args) {

		String s1 = "abd";
		String s2 = "abd";

		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s1 == s2);

		System.out.println("String s1 and s2 :" + "  " + (s1 == s2));
		System.out.println(s1.equals(s2));

	}
}
