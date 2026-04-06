package com.DSA;

import java.util.Arrays;

public class MergeSort {

	void main() {
		int[] arr = { 2, 4, 2, 6, 1, 7, 8 };
		for (int i = 0; i < arr.length; i++) {
			divide(arr);

		}
		System.out.println(Arrays.toString(arr));

	}

	void divide(int[] arr) {

		if (arr.length == 1) {
			return;
		}

		int[] left = new int[arr.length / 2];
		int[] right = new int[arr.length - left.length];

		int i;

		for (i = 0; i < left.length; i++) {
			left[i] = arr[i];
		}
		for (int j = 0; j < right.length; j++) {
			right[j] = arr[i++];
		}

		divide(left);
		divide(right);
		merge(left, right, arr);
	}

	void merge(int[] l, int[] r, int[] arr) {
		int i = 0, j = 0, k = 0;

		while (i < l.length && j < r.length) {
			if (l[i] < r[j])
				arr[k++] = l[i++];
			else
				arr[k++] = r[j++];
		}

		while (i < l.length)
			arr[k++] = l[i++];
		while (j < r.length)
			arr[k++] = r[j++];
	}
}
