package com.Arrays;

public class MissingNum {

	int findMissing(int[] arr, int n) {
		int sum = 0;
		for (int x : arr) {
			sum += x;
		}

		return (n * (n + 1)) / 2 - sum;
	}

	void main() {
		int arr[] = { 1, 2, 3, 5, 6, 7, 4 };
		int n = arr.length + 1;
		System.out.println("Missing number is : " + findMissing(arr, n));
	}
}
