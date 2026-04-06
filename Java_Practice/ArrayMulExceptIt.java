package com.Java_Practice;

public class ArrayMulExceptIt {

	
	
	void main() {
		
		int[] arr= {1,2,3,4};
		int[] arr1=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			int prod=1;
			for(int j=0;j<arr.length;j++) {
				if(i==j) {
					continue;
				}
				else prod*=arr[j];
			}
			arr1[i]=prod;
		}
		
		for(int x:arr1) {
			System.out.print(x+" ");
		}
		
	}
	
}
