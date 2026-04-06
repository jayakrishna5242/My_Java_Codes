package com.Java_Practice;

public class Gst {

	int amount, disc, total, gst;

	Gst(int price1, int price2, int price3) {
		amount = price1 + price2 + price3;
		if (amount > 5000) {
			disc = (int) (amount * 0.10);
			amount -= disc;
		}
		gst = (int) (amount * 0.18);
		total = amount + gst;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gst g1 = new Gst(2000, 2000, 2000);
		System.out.println("Total Discount : " + g1.disc);
		System.out.println("Total Amount : " + g1.amount);
		System.out.println("Total GST : " + g1.gst);

		System.out.println("Grand Total : " + g1.total);

	}

}
