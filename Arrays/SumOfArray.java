package com.Arrays;

import java.util.Scanner;

public class SumOfArray {

	int findSum(int[] arr) {
		int sum = 0;
		for (int c : arr)
			sum += c;
		return sum;
	}

	void main() {

		Scanner sc = new Scanner(System.in);
		System.out.print("Ente Array Size : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Sum of Array Elements is : " + findSum(arr));
		System.out.println("Product of Array Elements is : " + findProd(arr));
	}

	int findProd(int[] a) {
		int prod = 1;
		for (int c : a)
			prod *= c;
		return prod;
	}
}
