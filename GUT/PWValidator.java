package com.GUT;

import java.util.Scanner;

public class PWValidator {

	boolean validateString(String s) {
		boolean containUpper = false, containSymbol = false, containDigit = false, containLower = false;
		if (s.length() >= 8) {
			char[] arr = s.toCharArray();
			for (Character ch : arr) {
				if (Character.isDigit(ch)) {
					containDigit = true;
				} else if (Character.isUpperCase(ch)) {
					containUpper = true;
				} else if (Character.isLowerCase(ch)) {
					containLower = true;
				} else if (ch > 'z' || ch > 'Z' || ch < 'a' | ch < 'A') {
					containSymbol = true;
				}
			}
		}

		if (containUpper && containSymbol && containDigit && containLower)
			return true;
		return false;
	}

	void main() {
		Scanner sc = new Scanner(System.in);

		String s = sc.next();

		if (validateString(s)) {
			System.out.println("Strong Password ");
		} else
			System.out.println("Not a Strong Password");

	}

}
