package com.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CatchException {

	void main() {

		Scanner s = new Scanner(System.in);
		boolean flag = true;

//		do {
//			try {
//				System.out.println("Enter a Number ");
//				
//				flag=false;
//			} catch (InputMismatchException e) {
//
//				flag=true;
//			}
//
//		}
//		while (flag);

		for(int i=5;i>=0;i--) {
			try {
			System.out.println(5/i);
		}
			catch(Exception e) {
				System.out.println("Enter again");
				for(int j=0;j<5;j++) {
					System.out.println(j);
				}
			}
			}
		
	}

}
