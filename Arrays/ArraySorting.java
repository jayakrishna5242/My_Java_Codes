package com.Arrays;

import java.util.Arrays;

public class ArraySorting {

	void main() {
		int arr[] = { 10, 2, 56, 34, 21, 9, 10, 45 };
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					arr[i] = arr[i] ^ arr[j];
					arr[j] = arr[i] ^ arr[j];
					arr[i] = arr[i] ^ arr[j];
				}
			}
		}

		for (int x : arr) {
			System.out.print(x + " ");
		}
		System.out.println();

	}
}
