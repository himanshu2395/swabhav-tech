package com.techlabs.manboy.test;

import com.techlabs.manboy.Boy;
import com.techlabs.manboy.IEmotional;
import com.techlabs.manboy.IMannerable;
import com.techlabs.manboy.Man;

public class Test {
	static void atTheMovies(IEmotional obj) {
		System.out.println("At the movies");
		obj.cry();
		obj.laugh();
		System.out.println("Man Ends");
	}

	static void atTheParty(IMannerable ob) {
		System.out.println("At the party");
		ob.wish();
		ob.depart();
		System.out.println("End of party");
	}

	public static void main(String[] args) {
		Man x = new Man();
		Boy y = new Boy();
		atTheParty(x);
		atTheParty(y);

		atTheMovies(y);

	}

}
