package com.exceptions;

import java.util.Scanner;

class LessBalanceException extends RuntimeException {

	LessBalanceException(String msg) {
		super(msg);
	}

}

public class BankException {

	int balance = 5000;

	void main() {
		Scanner sc = new Scanner(System.in);
		withdraw(sc.nextInt());
	}

	void withdraw(int money) {
		if (money > balance) {
			try {
				throw new LessBalanceException("Balance Low");
			} catch (LessBalanceException le) {
				le.getMessage();
			}

			finally {
				System.out.println("Withdraw Failed");
			}

		}
		else {
			System.out.println("Withdraw Success");
		}

	}
}
