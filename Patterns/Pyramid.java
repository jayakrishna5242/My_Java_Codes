package com.Patterns;

public class Pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 8;
		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}

			System.out.println();
		}
		System.out.println();
		System.out.println("______________");
		System.out.println();
		int n1 = 8;
		for (int i = 1; i <= n1; i++) {

			for (int j = 1; j <= n1 - i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(i + " ");
			}

			System.out.println();
		}
	}

}
