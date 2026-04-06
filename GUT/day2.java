package com.GUT;

import java.util.Scanner;

public class day2 {

	boolean checkPalindrome(String s) {
		int start = 0, end = s.length() - 1;
		while (start <= end) {
			if (s.charAt(start) != s.charAt(end))
				return false;
			start++;end--;
		}
		return true;
	}

	void main() {

		String s = new Scanner(System.in).next();
		if (checkPalindrome(s)) {
			System.out.println("Given String is palindrome ");
		} else
			System.out.println("Given String is not a palindrome ");

	}
}
