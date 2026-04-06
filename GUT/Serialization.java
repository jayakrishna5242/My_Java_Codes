package com.GUT;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.io.ObjectOutputStream;

class Employee2 implements Serializable {

	int empId;
	String name, address;
	transient double sal;
	private static final long serialversionUID=1L;

	Employee2(int empId, String name, double sal, String address) {
		this.name = name;
		this.empId = empId;
		this.sal = sal;
		this.address = address;
	}
}

public class Serialization {

	void main() throws IOException {
		Employee2 e1=new Employee2(101,"Jaya",90000.00,"Cheepinapi");

		FileOutputStream fos=new FileOutputStream("C:\\Users\\jayak\\OneDrive\\Documents\\New.ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		try {
		oos.writeObject(e1);
	}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
}}
