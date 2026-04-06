package com.case_study.student_teacher;

public class Student extends Person {
	private  int rollnum;
	private String course;
	
	@Override
	void display() {
		System.out.println(
				"Student Nmae : " + getName() + " , Student Age : " + getAge() + " , Student Address : " + getAddress()+", Course : "+course+", Roll Number : "+rollnum);
	}

	void main(String[] args) {

		Student s = new Student();
		s.course="JFS";
		s.rollnum=15;
		s.setName("JAYA");
		s.setAge(22);
		s.setAddress("Cheepinapi");

		s.display();
	}

}
