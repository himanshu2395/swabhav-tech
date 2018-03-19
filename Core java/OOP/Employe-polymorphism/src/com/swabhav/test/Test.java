package com.swabhav.test;

import com.swabhav.techlabs.Developer;
import com.swabhav.techlabs.Employe;
import com.swabhav.techlabs.Manager;

public class Test {

	public static void main(String[] args) {

		Developer d1 = new Developer(1344549, "himanshu", 200);
		Manager m1 = new Manager(133540, "Sachin", 300);
		printpay(d1);
		printpay(m1);

	}

	private static void printpay(Employe employe) {
		System.out.println("*********SALARY SLIP********");
		System.out.println();
		System.out.println("employe name " + employe.getName());
		System.out.println();
		System.out.println("employe Id = " + employe.getId());
		System.out.println();
		System.out.println("basic pay = " + employe.getBasic());
		System.out.println();
		System.out.println(employe.toString());
		System.out.println();
		System.out.println(" Total salary " + employe.totalSalary());
		System.out.println();
		System.out.println("**********END***********");

	}

}
