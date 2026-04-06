package com.Java_Practice;

public class Factorial {

	
	// using recursion 
//	int fact(int n){
//		
//		if(n==1) return 1;
//		return n*fact(n-1);
//		
//	}
//	void main(String[] args) {
//
//		int a=5;
//		System.out.println(fact(5));
//		
//		
//	}
	
	// Geneal Approach
	void main() {
		
	
	int a=5;
	int fact=1;
	
	for(int i=1;i<=a;) {
		fact*=i;
		i++;
	}
	System.out.println(fact);
	}
}
