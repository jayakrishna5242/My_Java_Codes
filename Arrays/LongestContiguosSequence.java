package com.Arrays;

public class LongestContiguosSequence {

	void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 5, 6, 3, 5, 7, 8, 2, 3, 4, 5 };
		int maxlen = 0;
		int start = 0;
		int end = 0;
		for (int i = 0; i <= arr.length - 1; i++) {
			int count = 0;
			System.out.print(arr[i]+" ");
			for (int j = i + 1; j < arr.length ; j++) {
				
				if (arr[i] < arr[j]) {

					System.out.print(arr[j] + " ");

				}
				else {
					break;
				}

			}System.out.println();
			
		}

	}

}
