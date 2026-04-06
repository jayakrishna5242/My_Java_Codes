package com.LanguageFundamentals;

public class CopyConstructor {

	String name;
	int age;

	CopyConstructor(String name, int age) {

		this.name = name;
		this.age = age;

	}

	CopyConstructor(CopyConstructor student) {

		this.name = "Mr . " + student.name;
		this.age = student.age + 1;

	}

	public static void main(String args[]) {

		CopyConstructor s1 = new CopyConstructor("Jaya", 22);
		CopyConstructor org = new CopyConstructor(s1);

		System.out.println("Original Name : " + s1.name);
		System.out.println("Age : " + s1.age);

		System.out.println("Duplicated Name for Manipulation : "+org.name);
		System.out.println("Duplicated Age for Manipulation : "+org.age);
	}

}
