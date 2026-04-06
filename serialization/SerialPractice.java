package com.serialization;

import java.io.Serializable;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

class User implements Serializable {
	private static final long serialVersionUID = 1L;
	String uname = "jk123";
	transient String pw = "12345";

}

public class SerialPractice {

	void main() throws IOException {

		User u = new User();

		try (FileOutputStream fo = new FileOutputStream("C:\\Users\\jayak\\OneDrive\\Documents\\New.ser");
				ObjectOutputStream os = new ObjectOutputStream(fo);) {
			os.writeObject(u);
		} catch (Exception e) {
			System.out.println("Donga dorikadu");
		}

	}

}
