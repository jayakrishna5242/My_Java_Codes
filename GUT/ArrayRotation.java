package com.GUT;

public class ArrayRotation {

	void leftrotate(int[] arr) {

		int start = arr[0];
		for (int i = 1; i < arr.length; i++) {
			arr[i - 1] = arr[i];

		}
		arr[arr.length - 1] = start;

	}

	void rightrotate(int[] arr) {

		int start = arr[arr.length - 1];
		for (int i = arr.length - 1; i > 0; i--) {
			arr[i] = arr[i - 1];

		}
		arr[0] = start;

	}

	void reverse(int[] arr, int k) {
		int start1 = k, end1 = arr.length - 1;
		int start = 0, end = arr.length - 1;
		while (start < end) {
			arr[start] = arr[end] ^ arr[start];
			arr[end] = arr[end] ^ arr[start];
			arr[start] = arr[end] ^ arr[start];
			start++;
			end--;
		}

		for (int i = 0; i < k; i++) {
			arr[i] = arr[i] ^ arr[k];
			arr[k] = arr[k] ^ arr[i];
			arr[i] = arr[i] ^ arr[k];
			k--;
		}
		
		
	}

	void main() {

		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };

		int rotations = 4;
		rotations = rotations % arr.length;
		reverse(arr, rotations);
		for (int i : arr) {
			System.out.print(i + " ");
		}

	}

}
