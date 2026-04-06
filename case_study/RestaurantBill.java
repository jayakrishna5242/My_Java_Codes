package com.case_study;

import java.util.Scanner;

public class RestaurantBill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int sum=0;
		System.out.println("Enter The No . Of Items Orderedd !!!!!!!");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			System.out.println("Enter Prices of "+i+" Item : ");
			int price=sc.nextInt();
			sum+=price;
		}
		System.out.println("Your Total Bill Is : "+sum);
		System.out.println("Average Pice of Each Item Is : "+sum/n);

	}

}
