package com.Java_Practice;


public class ChekSquares {

	


boolean checkNum(int n) {
	
	for(int i=0;i<n;i++) {
		for(int j=0;j<n;j++) {
			if(i*i+j*j==n) {
				System.out.println(i+" "+j);
				return true;
			}
		}
	}
	return false;
	
}
	void main() {
		
		System.out.println(checkNum(5));
		System.out.println(checkNum(3));
		System.out.println(checkNum(13));
		System.out.println(checkNum(10));


	}
}
