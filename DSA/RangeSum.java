package com.DSA;

public class RangeSum {

	void main() {
		int[] arr = { 5, 10, 20, 50, 100 };

		for (int i = 1; i < arr.length; i++) {
			arr[i] = arr[i] + arr[i - 1];
		}

		int range1 = 2, range2 = 3;
		int sum = 0;

		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
		if (range1 == 0)
			System.out.println(arr[range2]);
		else {
			for (int i = range1; i <= range2; i++) {
				sum += arr[i];
			}

			sum -= arr[range1 - 1];
		}
		System.out.println(sum);
	}

}
