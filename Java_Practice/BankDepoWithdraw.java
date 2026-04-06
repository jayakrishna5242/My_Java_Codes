package com.Java_Practice;

import java.util.Scanner;

public class BankDepoWithdraw {
	static 		Scanner sc = new Scanner(System.in);
	static String name = "JayaKrishna";
	static int ac = 4244, panm = 1234, pin1 = 4238;
	static double balance = 50000;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Account No : ");
		int acno = sc.nextInt();
		System.out.println("Enter Your Pan 4 digits  : ");
		int pan = sc.nextInt();
		System.out.println("Enter Your Pin  : ");
		int pin = sc.nextInt();

		if (acno == ac && pan == panm && pin == pin1) {

			while (true) {
				System.out.println("1 for depo 2 for withdraw 3 for balance and 4 for exit ");
				int choice = sc.nextInt();
				if (choice == 1) {
					depo();

				} else if (choice == 2) {
					withdraw();
				} 
				else if(choice==3) {
					balance();
				}
				else {
					break;
				}
			}
		}

	}

	static void withdraw() {

		System.out.println("Enter Amount to withdraw : ");
		int amount = sc.nextInt();
		System.out.println("Withdraw Success : ");
		balance -= amount;
		System.out.println("Current Amount  : " + balance);

	}

	static void depo() {

		System.out.println("Enter Amount to Deposit : ");
		int amount = sc.nextInt();
		System.out.println("Depo Success : ");
		balance += amount;
		System.out.println("Current Amount  : " + balance);

	}
	
	static void balance() {
		System.out.println("Your current Balance is : "+balance);
	}

}
