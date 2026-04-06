package com.DSA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SlidingWindow {

	void main() {

		int[] arr = { 10, 120, 35, 45, 60, 60, 100 };
		int k = 3;
		int sum = 0;
		for (int i = 0; i <= arr.length - k; i++) {

			int window = 0;
			for (int j = i; j < i + k; j++) {
				System.out.print(arr[j] + " ");
				window += arr[j];
			}
			if (window > sum)
				sum = window;

			System.out.println(window);
			
			
			List<Integer> l= new ArrayList(Arrays.asList());
			
			

		}
		System.out.println(sum);

	}

	void main1() {
		
	}
	
}
