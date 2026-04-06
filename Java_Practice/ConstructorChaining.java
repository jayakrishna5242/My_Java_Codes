package com.Java_Practice;

public class ConstructorChaining {

	int eid;
	String name;
	double sal;
	long phone;

	ConstructorChaining() {
		this(101);
		System.out.println("No Arg Constructore called");
	}

	ConstructorChaining(int eid) {
		this("Jaya", eid);
		System.out.println("EID constructore called");
	}

	ConstructorChaining(String name, int eid) {
		this(name, eid, 100000);
		System.out.println("EID , Name constructore called");

	}

	ConstructorChaining(String name, int eid, double sal) {
		this(name, eid, sal, 630448300);
		System.out.println("EID , Name ,Sal constructore called");

	}

	ConstructorChaining(String name, int eid, double sal, double phone) {

		this.name = name;
		this.eid = eid;
		this.sal = sal;
		this.phone = (long) phone;
		System.out.println("EID , Name ,Sal , Phone constructore called");

	}

	public static void main(String args[]) {
		System.out.println("Opening Thread Found Here  !!!! ");
		ConstructorChaining c3 = new ConstructorChaining();

		ConstructorChaining c1 = new ConstructorChaining(102);

		ConstructorChaining c2 = new ConstructorChaining("krishna", 103, 45000, 824786877);

		c1.show();
		c2.show();
		c3.show();
		Another a1 = new Another();
		a1.show();
	}

	void show() {
		System.out.println();
		System.out.println("***************");
		System.out.println("Emp Id : " + eid);

		System.out.println("Emp Name : " + name);
		System.out.println("Emp Sal : " + sal);
		System.out.println("Emp Pone : " + phone);
		System.out.println("***************");

	}

}

class Another extends ConstructorChaining {

	Another() {
		super(101);
	}

}