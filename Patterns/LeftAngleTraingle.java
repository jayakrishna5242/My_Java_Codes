package com.Patterns;

public class LeftAngleTraingle {
	void main() {

		int n=6;
		for(int i=1;i<=n;i++) {
			for (int j=n-i;j>=1;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print("*");
			}
		
		System.out.println();}
		
	}

}
