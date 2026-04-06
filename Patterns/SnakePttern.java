package com.Patterns;

import java.util.Scanner;

public class SnakePttern {

	void printSnake(int n) {
		int c = 1;
		for (int i = 1; i <= n; i++) {
			if (i % 2 != 0) {
				for (int j = 1; j <= n; j++) {
					System.out.print((c) + " ");
					c++;
				}
				c += n - 1;
			} else {
				for (int j = 1; j <= n; j++) {
					System.out.print(c + " ");
					c--;
				}
				c += n + 1;
			}

			System.out.println();

		}

	}

	void main() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number : "+ " ");
		int n = sc.nextInt();
		printSnake(n);

	}

}
