package com.Java_Practice;

import java.util.Scanner;

public class CountingNumberDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a = sc.nextInt();
		// Best Option
		System.out.println((int) Math.log10(a) + 1);

		// Regular
		int c = 0;
		while (a != 0) {
			c++;
			a = a / 10;
		}
		System.out.println(c);

		
		
	}

}
