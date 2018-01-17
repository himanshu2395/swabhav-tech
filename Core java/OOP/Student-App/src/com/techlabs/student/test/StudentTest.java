package com.techlabs.student.test;

import com.techlabs.student.GenderOption;
import com.techlabs.student.Student;

public class StudentTest {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		printDetails(s1);
		s1.setRollno(1344549);
		s1.setFirstName("Himanshu");
		s1.setLastName("Mishra");
		s1.setCgpa(7);
		s1.setGender(GenderOption.Male);
		printDetails(s1);

		Student s2 = new Student(1344655, "rahul", "sharma", 8, GenderOption.Male);
		printDetails(s2);

	}

	public static void printDetails(Student student) {
		System.out.println("student roll no=" + student.getRollno());
		System.out.println("Student First name=" + student.getFirstName());
		System.out.println("Student Last name=" + student.getLastName());
		System.out.println("Student Cgpa=" + student.getCgpa());
		System.out.println("Student Gender=" + student.getGender());
		System.out.println("Student percentage=" + student.getConvertCgpaToPercent());
		System.out.println("Student full name=" + student.getFullName());

	}

}
