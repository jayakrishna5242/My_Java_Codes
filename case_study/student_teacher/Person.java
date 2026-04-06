package com.case_study.student_teacher;

public class Person {

	private String name;
	private int age;
	private String address;

	void setName(String name) {
		this.name = name;
	}

	void setAge(int age) {
		this.age = age;
	}

	void setAddress(String address) {
		this.address = address;
	}

	String getAddress() {
		return address;
	}

	String getName() {
		return name;
	}

	int getAge() {
		return age;
	}

	void display() {
		System.out.println("Person Nmae   : " + name + " Person Age : " + age + " Person Address : " + address);
	}
}
