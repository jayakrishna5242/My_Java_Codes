package com.LoopingStatements;

public class Factorial {

	void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		System.out.println(findfact(n));

	}
	

	int findfact(int n) {
		
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact*=i;
		}
		
		return fact;
		
	}

}
