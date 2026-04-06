package com.case_study.student_teacher;

public class Teacher extends Person implements Cloneable {
	int empid;
	String subject;

	@Override
	void display() {
		System.out.println("Teacher Nmae : " + getName() + " , Teacher Age : " + getAge() + " , Teacher Address : "
				+ getAddress());
	}

	void display1() {

	}

	void main(String[] args) throws CloneNotSupportedException {
		//child object parent reference
		Person s = new Teacher();
		s.setName("JAYA");
		s.setAge(22);
		s.setAddress("Cheepinapi");

		s.display();

		Teacher t = new Teacher();
		System.out.println((Object)t.clone().hashCode());
	}

}
