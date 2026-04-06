package com.Java_Practice;

import java.util.Scanner;

public class CrossPattern {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter odd number to make perfect");
		int n = s.nextInt();
		int num=1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i == j || i + j == n + 1) {
//					if (i > n / 2) {
//						System.out.print(n - i + 1);
//					}
//
//					else
//						System.out.print(i);
					System.out.print(num);
				} else {
					System.out.print(" ");
				}
			}
			
			num= i<=n/2 ? num+1: num-1;
			System.out.println();
		}

	}

}
