package com.projects;
import java.util.Scanner;

public class GuessTheNumber {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	
		while (true) {
			boolean flag = true;
			double n = Math.random() * 10;
			
			int count = 0;
			while (flag) {
				System.out.println((int) n);
				if (count < 3) {
					System.out.println("Enter number from 0 to 10 ");
					int num = sc.nextInt();
					if (num == (int) n) {
						System.out.println("Congratulations");
						System.out.println("Do You Want to play again (yes/on)");
						String c = sc.next();
						if (c.equalsIgnoreCase("yes")) {
							flag = true;
						} else {
							flag = false;
						}
					}
					else if(num<n) {
						System.out.println("You Gessed Low Try Again !!!!!");
						count++;
					}

					else {
						System.out.println("You Guessed High Try Again !!!!!");
						count++;
					}

				} else if (count > 2) {
					System.out.println("You are out of lives");
					System.out.println("Do You Want to play again (yes/on)");
					String c = sc.next();
					if (c.equalsIgnoreCase("yes")) {
						flag = true;
						count = 0;
					} else {
						flag = false;
					}
				}

			}
		}

	}

}
