package com.GUT;

import java.util.Scanner;

public class Calculator {

	int add(int a, int b) {
		return a+b;
	}
	int sub(int a, int b) {
		return a-b;
	}int mul(int a, int b) {
		return a*b;
	}int div(int a, int b) {
		return a/b;
	}
	void main() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number : ");
		int a = sc.nextInt();
		System.out.println("Enter Second Number : ");
		int b = sc.nextInt();

		System.out.println("Enter Your Option ");
		System.out.println("1 . Addition");
		System.out.println("2 . Subtratction");
		System.out.println("3 . Multiplication");
		System.out.println("4 . Division");
		
		int n=sc.nextInt();
		switch(n) {
		case 1 -> System.out.println( "Addition of "+a+" , "+b+" is "+add(a,b));
		case 2-> System.out.println( "Subtratction of "+a+" , "+b+" is "+sub(a,b));
		case 3 -> System.out.println( "Multiplication of "+a+" , "+b+" is "+mul(a,b));
		case 4 -> System.out.println( "Division of "+a+" , "+b+" is "+div(a,b));
		default -> System.out.println("Please Enter A valid option ");
		}

	}
}
