package com.Java_Practice;


public class BankEmp implements Comparable<BankEmp> {
	String name;
	double sal;

	BankEmp(String name, double sal) {
		this.name = name;
		this.sal = sal;
	}
	
	public String toString() {
		return "name : "+name+" , sal: "+sal;
	}

	@Override
	public int compareTo(BankEmp o) {
		
		if(this.sal>o.sal) return -1;
		else if(this.sal<o.sal) return 1;
		return 0;
		
		
	}

	
}