package com.techlabs.moveable.test;

import com.techlabs.moveable.Bike;
import com.techlabs.moveable.Car;
import com.techlabs.moveable.IMoveable;
import com.techlabs.moveable.Truck;

public class Test {

	public static void main(String[] args) {

		IMoveable[] moveable = new IMoveable[3];
		moveable[0] = new Bike();
		moveable[1] = new Car();
		moveable[2] = new Truck();
		startRace(moveable);

	}

	static void startRace(IMoveable[] moveable) {
		for (IMoveable i : moveable) {
			i.move();
		}

	}

}
