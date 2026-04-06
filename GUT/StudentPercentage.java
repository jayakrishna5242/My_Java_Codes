package com.GUT;

import java.util.Scanner;

public class StudentPercentage {

	void findTotal(int[] arr) {

		double total = 0;
		for (int x : arr) {
			total += x;
		}

		System.out.println("Obtained Marks : " + total);
		System.out.println("Total Marks : "+arr.length*100);
		System.out.println("Average Marks : " + total / arr.length);

		int percentage = (int)(total/(arr.length*100)*100);

		System.out.println("Percentage is : " + percentage+"%");

		String grade = percentage >= 90 ? "A"
				: percentage >= 80 ? "B" : percentage >= 70 ? "C" : percentage >= 60 ? "D" : "F";

		System.out.println("Grade Is : " + grade);

	}

	void main() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student name");
		String name = sc.nextLine();
		System.out.println("Enter Number Of subjects");

		int n = sc.nextInt();
		int[] marks = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.println("Enter Marks : ");
			int mark = sc.nextInt();
			marks[i] = mark;

		}

		findTotal(marks);
	}

}
