package com.GUT;

public class SubArray {

	boolean arrayCount(int[] arr) {
		int ones = 0, zeros = 0;
		for (int x : arr) {
			if (x == 0)
				zeros += 1;
			else
				ones += 1;

		}
		if (zeros == ones)
			return true;
		return false;
	}

	void main() {
		int[] arr = { 1, 0, 1 };
		int max = 0;
		int start = 0, end = arr.length - 1;
		while (start < end) {
			int[] arr1 = new int[start + end];
			for (int i = 0; i < arr1.length; i++) {
				arr1[i] = arr[i];
			}
			if (arrayCount(arr1)) {
				max = Math.max(max, arr1.length);
				end--;
			} else {
				end--;
			}

		}

		System.out.println(max);
	}
}
