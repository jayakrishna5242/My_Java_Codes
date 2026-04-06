package com.Patterns;

public class RightWing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=6;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
			System.out.print("*");
		}
			System.out.println();}
		
		for(int i=2;i<=n;i++) {
			for(int j=n;j>=i;j--) {
			System.out.print("*");
		}
			System.out.println();}
		

	}

}
