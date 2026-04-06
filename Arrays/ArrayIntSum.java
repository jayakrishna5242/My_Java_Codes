package com.Arrays;

public class ArrayIntSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,7,8,9,1,15};
		int n=9;
		for (int i=0;i<arr.length-1;i++) {
			for (int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j]==n) {
					System.out.println(i+" "+j);
				}
			}
		}

	}

}
