package com.GUT;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class FirstRepeat {

	int findElem(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j])
					return i;
			}
		}

		return -1;
	}

	boolean findElement(int[] arr) {
		List<Integer> arr1= new LinkedList();
		for(int x: arr) {
			if(arr1.contains(x)) {
				System.out.println("Element Found  :  "+x);
				return true;
			}
			else arr1.add(x);
		}
		return false;
	}
	
	void main() {
		int[] arr = { 1, 2, 3, 2, 4, 3 };
		int index = findElem(arr);
		if (index >= 0) {
			System.out.println("Element Found  :  "+arr[index]);
		} else
			System.out.println("No duplicate element");
		
		if(!findElement(arr)) System.err.println("Not Found Any Duplicates ");
		

	}
}
