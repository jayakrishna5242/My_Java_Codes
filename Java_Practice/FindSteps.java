package com.Java_Practice;

import java.util.ArrayList;

import java.util.List;

public class FindSteps {



	public List<Integer> getSteps(int[] arr) {
		List<Integer> l = new ArrayList();
		for (int x : arr) {
			int count = 0;
			;
			while (x > 0) {
				if (x % 2 == 0) {
					x /=2;
					count++;
				} else {
					x -= 1;
					count++;
				}
			}
			l.add(count);
		}

		return l;

	}

	void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 8, 4, 5, 7 };
		System.out.println(getSteps(arr));

	}

}
