package com.ConditionalStatements;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter player jersey No : ");
		int n = sc.nextInt();
		switch (n) {
		case 7: {
			System.out.println("Dhoni");
			break;
		}
		case 45: {
			System.out.println("Rohit");
			break;
		}
		case 18: {
			System.out.println("Kohli");
			break;
		}
		case 4: {
			System.out.println("AbhiSheik");
			break;
		}
		case 72: {
			System.out.println("Tilak");
			break;
		}
		case 10: {
			System.out.println("Sachin");
			break;
		}
		default: {
			System.out.println("Uknown");
			break;
		}
		}
	}
}
