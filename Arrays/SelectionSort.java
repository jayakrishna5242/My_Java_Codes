package com.Arrays;

public class SelectionSort {

	int[] selectionSort(int[] arr) {

		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			int minIndex = i;

			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[minIndex])
					minIndex = j;
			}
			int temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
			count++;
		}
		System.out.println(count);

		return arr;
	}

	void main() {
		int[] arr = { 12, 8, 45, 8, 34, 90 };
		int[] x = selectionSort(arr);
		for (int y : x)
			System.out.print(y + " ");

	}

}
