package com.LoopingStatements.WhileLoop;

import java.util.Scanner;

public class WhileLoop {

	void main() {
		Scanner s = new Scanner(System.in);
		boolean b = true;
		while (b) {
			System.out.println("Enter first number");
			int n1 = s.nextInt();
			System.out.println("Enter Second number");
			int n2 = s.nextInt();
			System.out.println("Enter Your Choice 1. Add , 2. Sub , 3. Mul , 4. Div , 5, Mod , 6. Exit ");
			int n = s.nextInt();
			switch (n) {
			case 1 -> System.out.println("Sum of Numbers : " + additon(n1, n2));
			case 2 -> System.out.println("Diff of Numbers : " + sub(n1, n2));
			case 3 -> System.out.println("Prod of Numbers : " + mul(n1, n2));
			case 4 -> System.out.println("Div of Numbers : " + div(n1, n2));
			case 5 -> System.out.println("Mod of Numbers : " + mod(n1, n2));
			case 6 -> {
				System.out.println("Exit from Menu ");
				b = false;
				s.close();
			}
			default -> System.out.println("Choose valid option");

			}
		}

	}

	int additon(int n1, int n2) {
		// TODO Auto-generated method stub
		return n1 + n2;
	}

	int mul(int n1, int n2) {
		// TODO Auto-generated method stub
		return n1 * n2;
	}

	int div(int n1, int n2) {
		// TODO Auto-generated method stub
		return n1 / n2;
	}

	int sub(int n1, int n2) {
		// TODO Auto-generated method stub
		return n1 - n2;
	}

	int mod(int n1, int n2) {
		// TODO Auto-generated method stub
		return n1 % n2;
	}
}
