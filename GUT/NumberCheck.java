package com.GUT;

import java.util.Scanner;

public class NumberCheck {

	boolean isOdd(int n) {
		return (n & 1) == 0;
	}

	boolean isPrime(int n) {
		if (n == 0 || n == 1)
			return false;
		else {
			for (int i = 2; i < Math.sqrt(n); i++) {
				if (n % i == 0) {
					return false;
				}
			}
			return true;
		}

	}

	boolean isPalindrome(int n) {
		int rev = 0;
		int temp = n;
		while (n != 0) {
			int reminder = n % 10;
			rev = rev * 10 + reminder;
			n /= 10;
		}

		return temp == rev;
	}

	void main() {
		try (Scanner sc = new Scanner(System.in)) {

			System.out.println("Enter a positiv integer : ");
			int n = sc.nextInt();

			System.out.println("The given number is even : " + isOdd(n));

			System.out.println("The given number is prime : " + isPrime(n));

			System.out.println("The given number is palindrome  : " + isPalindrome(n));

		}
	}

}
