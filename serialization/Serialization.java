package com.serialization;
import java.io.Serializable;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
class Student implements Serializable{

//	private static final long serialVersionUID = 1L;
	private static final long serialVersionUID=1L;
	String name="Jayakrishna";
	int ind=101;
	transient String password="jk@123";
}


public class Serialization {

	void main() throws IOException{
		
		Student s= new Student();
		
		FileOutputStream fo= new FileOutputStream("C:\\Users\\jayak\\OneDrive\\Documents\\New.ser");
		
		ObjectOutputStream os= new ObjectOutputStream(fo);
		
		os.writeObject(s);
		
	}
	
	
	
	
}
