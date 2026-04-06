package com.Java_Practice;

public class BuyAndSellStock {

	// buy only once and sell only once
	int getMaxProfit(int[] arr) {
		int maxProfit = 0;
		int index1 = 0, index2 = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] - arr[i] > maxProfit) {
					maxProfit = arr[j] - arr[i];
					index1 = i;
					index2 = j;
				}
			}
		}
		System.out.println("Indices " + index1 + " " + index2);
		return maxProfit;
	}
	// buy any no of times seell any no of times
	int getMaxProfit2(int[] arr) {
		int maxProfit = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i + 1] > arr[i]) {
				maxProfit += arr[i + 1] - arr[i];
				System.out.println("buyed At "+arr[i]+" Sold at :"+arr[i+1]+" Profit : "+maxProfit);
			}
		}
		return maxProfit;
	}

	void main() {
		int[] arr = { 13, 2, 1, 4, 5, 7, 8, 9 };
		System.out.println("Max Profit is : " + getMaxProfit(arr));
		System.out.println("Max Profit is : " + getMaxProfit2(arr));

	}
}
