package com.serialization;
import java.io.IOException;
import java.lang.ClassNotFoundException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;
public class Deserialization {

		void main() throws IOException, ClassNotFoundException {
			FileInputStream fi= new FileInputStream("C:\\Users\\jayak\\OneDrive\\Documents\\New.ser");
			ObjectInputStream oi= new ObjectInputStream(fi);
			Student s1=(Student)oi.readObject();
			System.out.println(s1.name);
			System.out.println(s1.password);
		}
	
}
