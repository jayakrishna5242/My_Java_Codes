package com.Java_Practice;

public class Employee {
	int eid1,exp;
	String name,hiredate;
	long sal;
	Employee(int eid, String ename, long salary, String hireDate, int experience) { 
		
		eid1=eid;
		name=ename;
		exp=experience;
		hiredate=hireDate;
		sal=salary;
		

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1 = new Employee(101, "jaya", 978456123, "10-10-25", 3);
		System.out.println(emp1.eid1);
		Employee emp2 = new Employee(102, "jaya", 978456123, "10-10-25", 3);
		System.out.println(emp2.eid1);

	}

}
