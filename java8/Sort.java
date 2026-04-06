package com.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student {
	private int id;
	private String name;
	private int marks;

	public Student(int id, String name, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getMarks() {
		return marks;
	}

	public String toString() {
		return "Name : " + name + " -> Marks : " + marks;
	}
}

public class Sort {

	void main() {

		Student s1 = new Student(1, "jk", 95);
		Student s2 = new Student(1, "kumar", 94);

		Comparator<Student> c = (m, n) -> m.getMarks() - n.getMarks();

		List<Student> l = Arrays.asList(s1, s2);
		Collections.sort(l, c);

		System.out.println(l);

	}

}
