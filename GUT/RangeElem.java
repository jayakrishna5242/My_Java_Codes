package com.GUT;

public class RangeElem {

	void main() {
		int[][] arr = { { 2, 3 }, { 1, 2 }, { 5, 6 }, { 4, 8 } };

		for (int i = 0; i < arr.length; i++) {
			int cont = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[i][0] > arr[j][0] && arr[i][1] < arr[j][1]) {
					cont++;

				}
			}
			if (cont >= 1) {
				System.out.println(1);
			} else
				System.out.println(0);
		}

	}
}
