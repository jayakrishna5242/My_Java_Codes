package com.exceptions;

class jaya extends Exception {
	jaya(String s) {
		super(s);
	}
}

public class CustomException {

	void main() {
		try {
			throw new jaya("Boom");
		} catch (jaya e) {
			e.printStackTrace();
		} finally {
			System.out.println("JK");
		}
	}

}
