package com.Java_Practice;

public class Calculator {

	static String comapnyName = "VSS";
	static int totalUnitsSold = 0;
	static int totalRevenue = 0;
	static float unitCost = 7.5f;

	String consumerNmae;
	double units, cost, tax, bill;

	public static void main(String[] args) {

//		Calculator c2=new Calculator();
//		c2.customer1();
//		c2.customer2();
//		c2.display();
		Calculator.setData();
		Calculator.display();

	}

	static void setData() {

		Calculator c1 = new Calculator();

		c1.units = 10;
		c1.consumerNmae = "Jaya";
		System.out.println();
		c1.cost = c1.units * unitCost;
		c1.tax = c1.cost * 0.05;
		c1.bill = c1.cost + c1.tax;

		System.out.println("Customer Name : " + c1.consumerNmae);

		System.out.println(c1.consumerNmae + " prchased " + c1.units + " Units");

		totalUnitsSold += c1.units;
		totalRevenue += c1.bill;

		Calculator c2 = new Calculator();

		c2.units = 10;
		c2.consumerNmae = "Krishna";
		c2.cost = c2.units * unitCost;
		c1.tax = c2.cost * 0.05;
		c2.bill = c2.cost + c2.tax;
		totalUnitsSold += c2.units;
		totalRevenue += c2.bill;
		System.out.println("Customer Name : " + c2.consumerNmae);

		System.out.println(c2.consumerNmae + " prchased " + c2.units + " Units");

	}

	static void display() {

		System.out.println("Total Units Sold :: " + totalUnitsSold);
		System.out.println("Total Profit  :: " + totalRevenue);

	}

//	void setData() {
//		Calculator c1=new Calculator();
//		
//	
//	}
//	
//	void customer1() {
//		Calculator c1=new Calculator();
//		c1.units=10;
//		c1.consumerNmae="Jaya";
//		System.out.println();
//		double cost=c1.units*unitCost;
//		double tax=cost*0.05;
//		double bill=cost+tax;
//		totalUnitsSold+=c1.units;
//		totalRevenue+=(int) bill;
//
//	}
//	
//
//	void customer2() {
//		Calculator c1=new Calculator();
//		c1.units=10;
//		c1.consumerNmae="Jaya";
//		System.out.println();
//		double cost=c1.units*unitCost;
//		double tax=cost*0.05;
//		double bill=cost+tax;
//		totalUnitsSold+=c1.units;
//		totalRevenue+=(int) bill;}
//
//	
//	
//	void display() {
//		
//		System.out.println("Units Sold :: "+totalUnitsSold);
//		System.out.println("Total Profit  :: "+totalRevenue);
//
//	}

}
