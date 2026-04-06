package com.case_study;

import java.util.Scanner;

public class RestaurantOrderingSystem {
	static long orderId = 000000000;

	public static void main(String[] args) {

		while (true) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose Food Categery : Starters , Main Course , Desserts  ");
		System.out.println("Enter Your Option");
		String s = sc.next();

		switch (s) {

		case "starter" -> {
			System.out.println("Choose from below List \n" + "1 . aloo\r\n" + "2 . dahi\r\n" + "3 . chilli\r\n"
					+ "4 . pakoda\r\n" + "5 . kebab\r\n" + "6 . samosa\r\n" + "7 . cheese\r\n" + "8 . spring\r\n"
					+ "9 . shawarma\r\n" + "10 . burger\r\n");
			System.out.println("Enter Your Option");
			String item = sc.next();
			switch (item) {

			case "aloo" -> {
				System.out.println("Enter yes to Confirm , no to Cancel");
				String canconfirm = sc.next();
				switch (canconfirm) {
				case "yes" -> {
					System.out.println("Your Order for Aloo Tikki Confirmed with OrderId : " + (orderId));
				}
				case "no" -> {
					System.out.println("Your Order for Aloo Tikki Canceled !! ThankYou");

				}
				default -> System.out.println("Enter yes or no only");
				}
			}
			case "dahi" -> {
				System.out.println("Enter yes to Confirm , no to Cancel");
				String canconfirm = sc.next();
				switch (canconfirm) {
				case "yes" -> {
					System.out.println("Your Order for Dahi Kebab Confirmed with OrderId : " + (orderId));
				}
				case "no" -> {
					System.out.println("Your Order for Dahi Kebab Canceled !! ThankYou");

				}
				default -> System.out.println("Enter yes or no only");

				}
			}
			case "chilli" -> {
				System.out.println("Enter yes to Confirm , no to Cancel");

				String canconfirm = sc.next();
				switch (canconfirm) {
				case "yes" -> {
					System.out.println("Your Order for Chilli Chicken Confirmed with OrderId : " + (orderId));
				}
				case "no" -> {
					System.out.println("Your Order for Chilli Chicken Canceled !! ThankYou");

				}
				default -> System.out.println("Enter yes or no only");

				}
			}
			case "pakoda" -> {
				System.out.println("Enter yes to Confirm , no to Cancel");

				String canconfirm = sc.next();
				switch (canconfirm) {
				case "yes" -> {
					System.out.println("Your Order for Paneer Pakoda Confirmed with OrderId : " + (orderId));
				}
				case "no" -> {
					System.out.println("Your Order for Paneer Pakoda Canceled !! ThankYou");

				}
				default -> System.out.println("Enter yes or no only");

				}
			}
			case "kebab" -> {
				System.out.println("Enter yes to Confirm , no to Cancel");

				String canconfirm = sc.next();
				switch (canconfirm) {
				case "yes" -> {
					System.out.println("Your Order for Chicken Kebab Confirmed with OrderId : " + (orderId));
				}
				case "no" -> {
					System.out.println("Your Order for Chicken Kebab Canceled !! ThankYou");

				}
				default -> System.out.println("Enter yes or no only");

				}
			}
			case "samosa" -> {
				System.out.println("Enter yes to Confirm , no to Cancel");

				String canconfirm = sc.next();
				switch (canconfirm) {
				case "yes" -> {
					System.out.println("Your Order for Samosa Confirmed with OrderId : " + (orderId));
				}
				case "no" -> {
					System.out.println("Your Order for Samosa Canceled !! ThankYou");

				}
				default -> System.out.println("Enter yes or no only");

				}
			}
			case "cheese" -> {
				System.out.println("Enter yes to Confirm , no to Cancel");
				String canconfirm = sc.next();
				switch (canconfirm) {
				case "yes" -> {
					System.out.println("Your Order for Corn Cheese Confirmed with OrderId : " + (orderId));
				}
				case "no" -> {
					System.out.println("Your Order for Corn CheeseCanceled !! ThankYou");

				}
				default -> System.out.println("Enter yes or no only");

				}
			}
			case "spring" -> {
				System.out.println("Enter yes to Confirm , no to Cancel");

				String canconfirm = sc.next();
				switch (canconfirm) {
				case "yes" -> {
					System.out.println("Your Order for Spring Rolls Confirmed with OrderId : " + (orderId));
				}
				case "no" -> {
					System.out.println("Your Order for Sprig Rolls Canceled !! ThankYou");

				}
				default -> System.out.println("Enter yes or no only");

				}
			}
			case "shewarma" -> {
				System.out.println("Enter yes to Confirm , no to Cancel");
				String canconfirm = sc.next();
				switch (canconfirm) {
				case "yes" -> {
					System.out.println("Your Order for Shewarma Confirmed with OrderId : " + (orderId));
				}
				case "no" -> {
					System.out.println("Your Order for Shewarma Canceled !! ThankYou");

				}
				default -> System.out.println("Enter yes or no only");

				}
			}
			case "burger" -> {
				System.out.println("Enter yes to Confirm , no to Cancel");
				String canconfirm = sc.next();
				switch (canconfirm) {
				case "yes" -> {
					System.out.println("Your Order for Burger Confirmed with OrderId : " + (orderId));
				}
				case "no" -> {
					System.out.println("Your Order for Burger Canceled !! ThankYou");

				}
				default -> System.out.println("Enter yes or no only");

				}
			}
			}

		}

		case "main" -> {
			System.out.println("Choose from below Main Course List \n" + "1 . biryani\n" + "2 . butterchicken\n"
					+ "3 . paneer\n" + "4 . pulao\n" + "5 . dal\n" + "6 . chickencurry\n" + "7 . mutton\n"
					+ "8 . palakpaneer\n" + "9 . fish\n" + "10 . egg\n");
			System.out.println("Enter Your Option");
			String item = sc.next();

			switch (item) {

			case "biryani" -> {
				System.out.println("Enter yes to Confirm , no to Cancel");
				String confirm = sc.next();
				switch (confirm) {
				case "yes" -> {
					System.out.println("Your Order for Chicken Biryani Confirmed with OrderId : " + (orderId));
				}
				case "no" -> {
					System.out.println("Your Order for Chicken Biryani Canceled !! ThankYou");
				}
				default -> System.out.println("Enter yes or no only");
				}
			}

			case "butterchicken" -> {
				System.out.println("Enter yes to Confirm , no to Cancel");
				String confirm = sc.next();
				switch (confirm) {
				case "yes" -> {
					System.out.println("Your Order for Butter Chicken Confirmed with OrderId : " + (orderId));
				}
				case "no" -> {
					System.out.println("Your Order for Butter Chicken Canceled !! ThankYou");
				}
				default -> System.out.println("Enter yes or no only");
				}
			}

			case "paneer" -> {
				System.out.println("Enter yes to Confirm , no to Cancel");
				String confirm = sc.next();
				switch (confirm) {
				case "yes" -> {
					System.out.println("Your Order for Paneer Butter Masala Confirmed with OrderId : " + (orderId));
				}
				case "no" -> {
					System.out.println("Your Order for Paneer Butter Masala Canceled !! ThankYou");
				}
				default -> System.out.println("Enter yes or no only");
				}
			}

			case "pulao" -> {
				System.out.println("Enter yes to Confirm , no to Cancel");
				String confirm = sc.next();
				switch (confirm) {
				case "yes" -> {
					System.out.println("Your Order for Veg Pulao Confirmed with OrderId : " + (orderId));
				}
				case "no" -> {
					System.out.println("Your Order for Veg Pulao Canceled !! ThankYou");
				}
				default -> System.out.println("Enter yes or no only");
				}
			}

			case "dal" -> {
				System.out.println("Enter yes to Confirm , no to Cancel");
				String confirm = sc.next();
				switch (confirm) {
				case "yes" -> {
					System.out.println("Your Order for Dal Tadka Confirmed with OrderId : " + (orderId));
				}
				case "no" -> {
					System.out.println("Your Order for Dal Tadka Canceled !! ThankYou");
				}
				default -> System.out.println("Enter yes or no only");
				}
			}

			case "chickencurry" -> {
				System.out.println("Enter yes to Confirm , no to Cancel");
				String confirm = sc.next();
				switch (confirm) {
				case "yes" -> {
					System.out.println("Your Order for Chicken Curry Confirmed with OrderId : " + (orderId));
				}
				case "no" -> {
					System.out.println("Your Order for Chicken Curry Canceled !! ThankYou");
				}
				default -> System.out.println("Enter yes or no only");
				}
			}

			case "mutton" -> {
				System.out.println("Enter yes to Confirm , no to Cancel");
				String confirm = sc.next();
				switch (confirm) {
				case "yes" -> {
					System.out.println("Your Order for Mutton Korma Confirmed with OrderId : " + (orderId));
				}
				case "no" -> {
					System.out.println("Your Order for Mutton Korma Canceled !! ThankYou");
				}
				default -> System.out.println("Enter yes or no only");
				}
			}

			case "palakpaneer" -> {
				System.out.println("Enter yes to Confirm , no to Cancel");
				String confirm = sc.next();
				switch (confirm) {
				case "yes" -> {
					System.out.println("Your Order for Palak Paneer Confirmed with OrderId : " + (orderId));
				}
				case "no" -> {
					System.out.println("Your Order for Palak Paneer Canceled !! ThankYou");
				}
				default -> System.out.println("Enter yes or no only");
				}
			}

			case "fish" -> {
				System.out.println("Enter yes to Confirm , no to Cancel");
				String confirm = sc.next();
				switch (confirm) {
				case "yes" -> {
					System.out.println("Your Order for Fish Fry Confirmed with OrderId : " + (orderId));
				}
				case "no" -> {
					System.out.println("Your Order for Fish Fry Canceled !! ThankYou");
				}
				default -> System.out.println("Enter yes or no only");
				}
			}

			case "egg" -> {
				System.out.println("Enter yes to Confirm , no to Cancel");
				String confirm = sc.next();
				switch (confirm) {
				case "yes" -> {
					System.out.println("Your Order for Egg Curry Confirmed with OrderId : " + (orderId));
				}
				case "no" -> {
					System.out.println("Your Order for Egg Curry Canceled !! ThankYou");
				}
				default -> System.out.println("Enter yes or no only");
				}
			}

			default -> System.out.println("Invalid Option Selected for Main Course");
			}
		}

		case "dessert" -> {
			System.out.println("Choose from below Dessert List \n" + "1. gulabjamun\n" + "2. rasmalai\n"
					+ "3. icecream\n" + "4. brownie\n" + "5. cheesecake\n" + "6. kheer\n" + "7. jalebi\n"
					+ "8. fruitsalad\n" + "9. cake\n" + "10. laddu\n");
			System.out.println("Enter Your Option");
			String item = sc.next();

			switch (item) {
			case "gulabjamun" -> {
				System.out.println("Enter yes to Confirm , no to Cancel");
				String confirm = sc.next();
				switch (confirm) {
				case "yes" ->
					System.out.println("Your Order for Gulab Jamun Confirmed with OrderId : " + (orderId));
				case "no" -> System.out.println("Your Order for Gulab Jamun Canceled !! ThankYou");
				default -> System.out.println("Enter yes or no only");
				}
			}
			case "rasmalai" -> {
				System.out.println("Enter yes to Confirm , no to Cancel");
				String confirm = sc.next();
				switch (confirm) {
				case "yes" -> System.out.println("Your Order for Rasmalai Confirmed with OrderId : " + (orderId));
				case "no" -> System.out.println("Your Order for Rasmalai Canceled !! ThankYou");
				default -> System.out.println("Enter yes or no only");
				}
			}
			case "icecream" -> {
				System.out.println("Enter yes to Confirm , no to Cancel");
				String confirm = sc.next();
				switch (confirm) {
				case "yes" -> System.out.println("Your Order for Ice Cream Confirmed with OrderId : " + (orderId));
				case "no" -> System.out.println("Your Order for Ice Cream Canceled !! ThankYou");
				default -> System.out.println("Enter yes or no only");
				}
			}
			case "brownie" -> {
				System.out.println("Enter yes to Confirm , no to Cancel");
				String confirm = sc.next();
				switch (confirm) {
				case "yes" ->
					System.out.println("Your Order for Chocolate Brownie Confirmed with OrderId : " + (orderId));
				case "no" -> System.out.println("Your Order for Chocolate Brownie Canceled !! ThankYou");
				default -> System.out.println("Enter yes or no only");
				}
			}
			case "cheesecake" -> {
				System.out.println("Enter yes to Confirm , no to Cancel");
				String confirm = sc.next();
				switch (confirm) {
				case "yes" -> System.out.println("Your Order for Cheesecake Confirmed with OrderId : " + (orderId));
				case "no" -> System.out.println("Your Order for Cheesecake Canceled !! ThankYou");
				default -> System.out.println("Enter yes or no only");
				}
			}
			case "kheer" -> {
				System.out.println("Enter yes to Confirm , no to Cancel");
				String confirm = sc.next();
				switch (confirm) {
				case "yes" -> System.out.println("Your Order for Kheer Confirmed with OrderId : " + (orderId));
				case "no" -> System.out.println("Your Order for Kheer Canceled !! ThankYou");
				default -> System.out.println("Enter yes or no only");
				}
			}
			case "jalebi" -> {
				System.out.println("Enter yes to Confirm , no to Cancel");
				String confirm = sc.next();
				switch (confirm) {
				case "yes" -> System.out.println("Your Order for Jalebi Confirmed with OrderId : " + (orderId));
				case "no" -> System.out.println("Your Order for Jalebi Canceled !! ThankYou");
				default -> System.out.println("Enter yes or no only");
				}
			}
			case "fruitsalad" -> {
				System.out.println("Enter yes to Confirm , no to Cancel");
				String confirm = sc.next();
				switch (confirm) {
				case "yes" ->
					System.out.println("Your Order for Fruit Salad Confirmed with OrderId : " + (orderId));
				case "no" -> System.out.println("Your Order for Fruit Salad Canceled !! ThankYou");
				default -> System.out.println("Enter yes or no only");
				}
			}
			case "cake" -> {
				System.out.println("Enter yes to Confirm , no to Cancel");
				String confirm = sc.next();
				switch (confirm) {
				case "yes" ->{
				orderId+=1;	
				System.out.println("Your Order for Chocolate Cake Confirmed with OrderId : " + (orderId++));
				}case "no" -> System.out.println("Your Order for Chocolate Cake Canceled !! ThankYou");
				default -> System.out.println("Enter yes or no only");
				}
			}
			case "laddu" -> {
				System.out.println("Enter yes to Confirm , no to Cancel");
				String confirm = sc.next();
				switch (confirm) {
				case "yes" -> System.out.println("Your Order for Laddu Confirmed with OrderId : " + (orderId));
				case "no" -> System.out.println("Your Order for Laddu Canceled !! ThankYou");
				default -> System.out.println("Enter yes or no only");
				}
			}
			}
		}

		default -> System.out.println("Enter Valid Option to Choose : ");
		}

	}}
}
