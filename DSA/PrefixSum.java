package com.DSA;

public class PrefixSum {

	void main() {
		int [] arr= {5,10,20,50,100};
		
		for(int i=1;i<arr.length;i++) {
			arr[i]=arr[i]+arr[i-1];
		}
		
		for(int i: arr) {
			System.out.print(i+" ");
		}
		
		
		
		
	}
	
}
