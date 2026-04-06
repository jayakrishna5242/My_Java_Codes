package com.DSA;

public class BinarySearch {

	int searchElementBinary(int arr[], int target) {

		int start = 0, end = arr.length - 1;

		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (arr[mid] == target) {
				return mid;
			} else if (arr[mid] > target) {
				end = mid - 1;

			} else {
				start = mid + 1;

			}
		}

		return -1;
	}

	void main() {
		int[] arr = { 10, 20, 30, 40, 50, 60, 70, 80, 90 };

		int index = searchElementBinary(arr, 990);

		if (index > -1)
			System.out.println("Element found at index : " + index);

		else
			System.out.println("Element not found at any index ");
	}

}
