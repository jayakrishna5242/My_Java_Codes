package com.Java_Practice;

import java.util.Scanner;

public class Grade {

	 void main() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student Name : ");
		String name = sc.nextLine();
		System.out.println("Enter Student Marks : ");
		int marks = sc.nextInt();

		String res = (marks >= 90) ? "S" : (marks >= 75) ? "A" : (marks >=60) ? "B" : (marks >= 45) ? "C" : "F";

		System.out.println(name+"'s Result Is : "+res);
		sc.close();
	}

}
