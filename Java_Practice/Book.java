package com.Java_Practice;

public class Book {
	
	
	int bookId;
	double actualPrice,discount;
	String Title,Author;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book1=new Book();
		Book book2=new Book();
		
		//book1
		
		book1.bookId=001;
		book1.actualPrice=1000;
		book1.discount=120;
		book1.Author="Tom Cruise";
		book1.Title="Do it in Your Way";
		
		//book2
		

		book2.bookId=002;
		book2.actualPrice=500;
		book2.discount=105;
		book2.Author="RaviSashtri";
		book2.Title="Do You Know Business";
		
		
		
		
		//printng data
		
		System.out.println("Books Details");
		System.out.println("*******************");
		System.out.println("Book Id: "+book1.bookId);
		System.out.println("Book Title "+book1.Title);
		System.out.println("Book Author "+book1.Author);
		System.out.println("Book Discount "+book1.discount);
		System.out.println("Book ActualPrice "+book1.actualPrice);
		System.out.println("Book DiscountedPrice"+(book1.actualPrice-book1.discount));
		
		
		
		
		//printng data
		
		System.out.println("Books Details");
		System.out.println("*******************");
		System.out.println("Book Id: "+book2.bookId);
		System.out.println("Book Title "+book2.Title);
		System.out.println("Book Author "+book2.Author);
		System.out.println("Book Discount "+book2.discount);
		System.out.println("Book ActualPrice "+book2.actualPrice);
		System.out.println("Book DiscountedPrice "+(book2.actualPrice-book2.discount));
		
	}

}
