package com.Arrays;

class student{
	int id;
	String course;
	long phone;
	String address;
	
	public String jaya() {
		
		
		return " Id : "+id+" Name : "+course+" Address : "+address;
	}
	
	public student(int id, String course, int phone, String address) {
		this.id = id;
		this.course = course;
		this.phone = phone;
		this.address = address;
	}
	
}

public class ArrayOfObjects {

	void main() {
		student s1=new student(101,"jfs",630448308,"hyd");
		
		student s2=new student(102,"pfs",630448308,"hyd");
		student s4=new student(103,"Devops",630448308,"hyd");
		student s3=new student(104,"Testing",630448308,"hyd");
		
		
		
		student[] stuInfo=new student[4];
		stuInfo[0]=s1;
		stuInfo[1]=s2;
		stuInfo[2]=s3;
		stuInfo[3]=s4;
		for(student x:stuInfo) {
			System.out.println(x.id+" "+x.course+" "+x.address);
			System.out.println("Student Info "+ x.jaya());
		}
	}
	
}
