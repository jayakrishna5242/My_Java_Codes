package com.GUT;

import java.util.Arrays;

public class MaxMin {

	void main() {
		int[] arr = { 9, 8, 6, 7, 3, 0, 4, 2, 1, 5, 6, 7, 9, 3, 7 };

		int max = arr[0], min = arr[0];
		for (int i : arr) {
			if (i > max) {
				max = i;
			}
			if (i < min) {
				min = i;
			}

		}
		System.out.println(max+" "+min);

		Arrays.sort(arr);
		System.out.println(arr[0] + " " + arr[arr.length - 1]);

	}
}
