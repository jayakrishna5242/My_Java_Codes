package com.Java_Practice;

import java.util.Scanner;

public class CarRental {
	static Scanner sc = new Scanner(System.in);

	CarRental() {
		System.out.println("Welcome to Zoom Car Rental");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CarRental c1 = new CarRental();
		System.out.println("Enter days to take for rental ");

		int days = sc.nextInt();

		String comp = c1.companyNmae();

		int dinc = c1.getDailyRent();

		int basetotal = c1.calBase(days, dinc);

		int ins = c1.getInsurance();

		int gtotal = c1.calTotal(basetotal, ins);

		System.out.println("Company Name : " + comp);
		System.out.println("Days Taken : " + days);
		System.out.println("Daily Cost : " + dinc);
		System.out.println("Base Cost : " + basetotal);
		System.out.println("Insurance Cost : " + ins);
		System.out.println("Grand Total : " + gtotal);
	}

	String companyNmae() {
		return "Zoom Car Rentals";
	}

	int getDailyRent() {
		return 1500;
	}

	int getInsurance() {
		return 500;
	}

	int calBase(int a, int b) {
		return a * b;
	}

	int calTotal(int base, int insu) {
		return base + insu;
	}

}
