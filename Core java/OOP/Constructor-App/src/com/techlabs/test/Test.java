package com.techlabs.test;

import com.techlabs.case2.B;

public class Test {

	public static void main(String[] args) {
		B obj = new B();
		B b1 = new B();
		System.out.println(b1.getFoo());
		B b2 = new B();
		System.out.println(b2.getFoo());
		B b3 = new B(20);
		System.out.println(b3.getFoo());

	}

}
