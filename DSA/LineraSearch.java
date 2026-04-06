package com.DSA;

public class LineraSearch {

	int searchElementLinear(int[] arr, int target) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == target)
				return i;
		}

		return -1;
	}

	void main() {
		int arr[] = { 10, 20, 30, 40, 50, 60, 70, 90 };
		int index=searchElementLinear(arr,100);
		if(index>-1) System.out.println("Element is found at : "+index);
		else System.out.println("Element not found ");

	}

}
