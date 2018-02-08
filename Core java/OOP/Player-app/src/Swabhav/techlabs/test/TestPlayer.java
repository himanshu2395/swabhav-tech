package Swabhav.techlabs.test;

import java.util.ArrayList;
import java.util.List;

import Swabhav.techlabs.Player;

public class TestPlayer {

	public static void main(String[] args) {
		Player p1 = new Player(1344549, "manish", 20);
		Player p2 = new Player(1344550, "rahul");
		p1 = p1.whoIsElder(p2);
		
		
		/*printDetails(p1);
		printDetails(p2);
		p1 = p1.whoIsElder(p1,p2);
		printDetails(p1);*/
		//printDetails(p2);
		
	}

	/*public static void printDetails(Player p) {
		System.out.println(p.getId());
		System.out.println(p.getName());
		System.out.println(p.getAge());
	}*/
	
	List<Long> abc = getListLong(new long[]{10,20,30,40});
	
	public List<Long> getListLong(long[] arLong){
		List<Long> longList = new ArrayList<Long>();
		//complete this method
		return longList;
	}
	
}
