package com.LoopingStatements.WhileLoop;

import java.util.Scanner;

public class SumOfNumbers {

	void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a Number  ");
		int n = s.nextInt();
		int sum = sumOfNumbers(n);

		System.out.println("Sum of Numbers is : " + sum);

		s.close();

	}

	int sumOfNumbers(int n) {
		int sum = 0;
		while (n-- != 0) {
			sum += n;
		}
		return sum;
	}
}
