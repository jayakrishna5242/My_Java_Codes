package com.Patterns;

public class DoublePyramid {


		public static void main(String[] args) {
			// TODO Auto-generated method stub

			
			// Double Pyramid using *
			int n = 7;
			for (int i = 1; i <= n; i++) {
				
				for(int j=1;j<=n-i;j++) {
					System.out.print(" ");
				}
				for (int j = 1; j <= i; j++) {
					System.out.print("* ");
				}
				
				for(int j=1;j<=n-i;j++) {
					System.out.print(" ");
				}
				for(int j=1;j<=n-i;j++) {
					System.out.print(" ");
				}
				for (int j = 1; j <= i; j++) {
					System.out.print("* ");
				}


				System.out.println();
			}
			
			
			System.out.println("_______________________________________________");
			System.out.println();
			// Double pyramid using NUmbers
			int n1 = 7;
			for (int i = 1; i <= n1; i++) {
				
				for(int j=1;j<=n1-i;j++) {
					System.out.print(" ");
				}
				for (int j = 1; j <= i; j++) {
					System.out.print(i+" ");
				}
				
				for(int j=1;j<=n1-i;j++) {
					System.out.print(" ");
				}
				for(int j=1;j<=n1-i;j++) {
					System.out.print(" ");
				}
				for (int j = 1; j <= i; j++) {
					System.out.print(i+" ");
				}


				System.out.println();
			}

		}

	}


