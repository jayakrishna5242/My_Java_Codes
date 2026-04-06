package com.GUT;

public class ReverseArrayWithoutExtraSpace {

	void main() {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		int start = 0, end = arr.length - 1;

		while (start < end) {
			arr[start] = arr[start] ^ arr[end];
			arr[end] = arr[start] ^ arr[end];
			arr[start] = arr[start] ^ arr[end];
			start++;
			end--;

		}

		for (int i : arr)
			System.out.print(i + " ");
	}
}
