package com.Arrays;

public class Array {

	void main() {
		// 1. declaration
		int[] arr;
		// 2. creation 
		arr=new int[5];
		// 3 . initialization
		// note default values will be provided to every index after creating array 
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		arr[3]=6;
		
		// 4. Representation
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		for(int x: arr) {
			System.out.print(x+" ");
		}
	}
}
