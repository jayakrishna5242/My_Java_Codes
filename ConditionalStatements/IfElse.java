package com.ConditionalStatements;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int a=10;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter A Number : ");
		int a = sc.nextInt();

		if (a % 2 == 0) {
			System.out.println("Even");
		} else {
			System.out.println("Odd");
		}

		System.out.println("Using Terinary     ");
		String res = (a % 2 == 0) ? "Even" : "Odd";
		System.out.println(res);
	}

}
