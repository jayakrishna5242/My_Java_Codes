package com.Java_Practice;

public class FindLeader {

	void findLeader(int[] arr) {
		for (int i = 0; i < arr.length ; i++) {
			int c=0;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					c++;
					break;
				}
				
			}
			if(c==0) {
				System.out.print(arr[i]+" ");
			}

		}
	}

	void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 16, 17, 4, 3, 5, 2 };
		findLeader(arr);
	}

}
