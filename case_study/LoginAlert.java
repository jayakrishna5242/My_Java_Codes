package com.case_study;
import java.util.Scanner;
public class LoginAlert {
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int count=0;
		while(count<=3) {
			System.out.println("Enter Your Password to Proceed : ");
			String pass=s.nextLine();
			if(pass.equals("1234")) {
				System.out.println("Success");
			}
		}

	}

}
