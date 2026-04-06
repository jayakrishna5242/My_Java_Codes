package com.Java_Practice;

public class CountingObjects {
	static int cont = 0;
	String F_name;
	int sid, marks;

	
	void show (CountingObjects  cn1){
		cn1.sid=101;
		
		
	}
		CountingObjects(String name, int sid, int marks) {
		F_name=name;
		cont++;
		System.out.println("Student ID : " + sid);
		System.out.println("Student Name : " + F_name);
		System.out.println("Student Marks : " + marks);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountingObjects cn1 = new CountingObjects("jaya", 101, 76);
		CountingObjects cn2 = new CountingObjects("krishna", 102, 58);
		CountingObjects cn3 = new CountingObjects("krupa", 103, 78);
		CountingObjects cn4 = new CountingObjects("Kalyan", 104, 98);

		
		
		System.out.println("No Of Objects : " + cont);
		System.gc();
		System.out.println(cn1.F_name="jk");
		
		

	}

}
