package com.Arrays;

public class ReverseArray {

	int[] findRev(int[] arr) {

		int[] rev = new int[arr.length];
		int c = 0;
		for (int i = arr.length - 1; i >= 0; i--) {
			rev[c] = arr[i];
			c++;
		}

		return rev;
	}

	void main() {
		int arr[] = { 1, 2, 3, 4 };

		int[] rev = findRev(arr);
		for (int x : rev) {
			System.out.print(x + " ");
		}

	}
}
