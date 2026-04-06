package com.Java_Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Employee1 {
	private int id;
	private String name;
	private double sal;
	private String branch;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public Employee1(int id, String name, double sal, String branch) {
		this.id = id;
		this.name = name;
		this.sal = sal;
		this.branch = branch;
	}

}

public class EmployeeHashMap {

	void main() {
		Employee1 emp1 = new Employee1(101, "Jaya", 8000000, "cse");
		Employee1 emp2 = new Employee1(102, "Krishna", 9000000, "ece");
		Employee1 emp3 = new Employee1(103, "Kanth", 1000000, "mech");
		Employee1 emp4 = new Employee1(104, "Jaya", 8000000, "cse");

		List<Employee1> employees=new ArrayList();
		
		employees.add(emp1);
		employees.add(emp2);
		employees.add(emp3);
		employees.add(emp4);
		
		Map <Integer ,ArrayList<String>> hm=new HashMap();
		
		for(Employee1 emp : employees) {
			hm.put(emp.getId(),new ArrayList(Arrays.asList(emp.getName(),emp.getBranch(),emp.getSal())));
		}
		
		
		System.out.println(hm);
		
	}

}
