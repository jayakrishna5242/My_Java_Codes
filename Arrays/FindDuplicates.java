package com.Arrays;

public class FindDuplicates {

	void main() {
		System.out.println("Opening Thread Found : ");
		int[] arr = { 1, 2, 5, 5, 4, 7, 3, 9, 2 };
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] == arr[j]) {
					System.out.print(arr[j] + " ");
				}
			}
		}
	}

}
