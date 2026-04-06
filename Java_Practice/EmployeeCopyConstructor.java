package com.Java_Practice;

public class EmployeeCopyConstructor {

	String name;
	double sal;

	EmployeeCopyConstructor(String name, double sal) {
		this.name = name;
		this.sal = sal;

	}

	EmployeeCopyConstructor(EmployeeCopyConstructor duplicate) {
		this.name = duplicate.name;
		this.sal = duplicate.sal + (duplicate.sal * 0.15);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeCopyConstructor original = new EmployeeCopyConstructor("Jaya", 120000);
		EmployeeCopyConstructor duplicate = new EmployeeCopyConstructor(original);

		System.out.println("*****Original*****");
		System.out.println(original.name);

		System.out.println(original.sal);
		System.out.println("*****Duplicate*****");
		System.out.println(duplicate.name);
		System.out.println(duplicate.sal);

	}

}
