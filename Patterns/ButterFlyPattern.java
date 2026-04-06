package com.Patterns;

public class ButterFlyPattern {

	public static void main(String[] args) {

		int n = 6;
		for (int i = 1; i < n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			for (int j = n - i; j > 1; j--) {
				System.out.print(" ");
			}

			for (int k = n; k <= 2 * n - i; k++) {
				System.out.print(" ");
			}

			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}

			System.out.println();
		}

		for(int i=0;i<=2*n;i++) {
			System.out.print("*");
			
		}System.out.println();

		
		for (int i = 1; i <= 6; i++) {
			
			for (int j = n; j > i; j--) {
				System.out.print("*");
			}
			for(int j=2*i;j>=1;j--) {
				System.out.print(" ");
			}
			for(int j=n;j>i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
