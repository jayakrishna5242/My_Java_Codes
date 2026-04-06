package com.GUT;
import java.util.ArrayList;
import java.util.List;
import java.lang.Comparable;
import java.util.*;
class Employee implements Comparable<Employee> {
	private int empId;
	private String name, address;
	private double sal;

	Employee(int empId, String name, double sal, String address) {
		this.name = name;
		this.empId = empId;
		this.sal = sal;
		this.address = address;

	}

	double getSal() {
		return sal;
	}

	String getName() {
		return name;
	}

	String getAddress() {
		return address;
	}

	int getEmpId() {
		return empId;
	}

	@Override
	public String toString() {
		return "ID : "+empId +" Name: "+name+" Salary : "+sal;
	}
	
	@Override
	public int compareTo(Employee e) {

//		if (this.sal > e.sal)
//			return 1;
//		else if (this.sal < e.sal)
//			return -1;
//		return 0;
		
		
		return this.getName().compareTo(e.getName());
	}
	
	
}

public class ObjectSort {

	void main() {

		List l= new ArrayList();
		Employee e1=new Employee(101,"Jaya",90000.00,"Cheepinapi");
		Employee e2= new Employee(102,"Krishna",95000.00,"Kaluvoya");
		Employee e3=new Employee(103,"Kumar",50000.00,"Nellore");
		
		l.add(e1);
		l.add(e2);
		l.add(e3);
		
		Collections.sort(l);
		
		System.out.println(l);
	}

}
