package Swabhav.techlabs.test;

import Swabhav.techlabs.Player;

public class TestPlayer {

	public static void main(String[] args) {
		// Player p1 = new Player(1344549, "manish", 8);
		// System.out.println(p1.getCount());
		// System.out.println("p1 hash code" + p1.hashCode());
		// Player p2 = new Player(1344550, "rahul");
		// System.out.println("p2 hash code" + p2.hashCode());
		// System.out.println(p1.getCount());
		// Player p3 = p1.whoIsElder(p2);
		// printDetails(p3);
		//
		Player[] accountholder = new Player[2];
		accountholder[0] = new Player(10, "manish", 15);
		accountholder[1] = new Player(10, "manish", 15);

		System.out.println(accountholder[0].equals(accountholder[1]));
		System.out.println(accountholder[0] == accountholder[1]);
		System.out.println(accountholder[0].hashCode());
		System.out.println(accountholder[1].hashCode());

		// for (int i = 0; i < accountholder.length; i++) {
		// System.out.println(accountholder[i]);
		// }

	}

	public static void printDetails(Player p) {
		System.out.println(p.getId());
		System.out.println(p.getName());
		System.out.println(p.getAge());
		// System.out.println("p hash code" + p.hashCode());

	}

}
