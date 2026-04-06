package com.LoopingStatements.WhileLoop;
import java.util.Scanner;
public class Factorial {

	
 void main() {
		
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter a Number to Find factorial : ");
		
		int n=s.nextInt();
		int fact=findFact(n);
		System.out.println("Factorial Of Given Number is : "+fact);
		s.close();
		
	}
	int findFact(int n) {
		int fact=1;
		while(n>0) {
			fact*=n;
			n--;
		}
		
		
		return fact;
	}
}
