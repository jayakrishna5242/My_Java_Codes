package com.Java_Practice;

public class EmpSalCalc {

	public static void main(String[] args) {

		String empName = "King";

		int sal = 27000;

		double pfded = sal * (0.05);

		System.out.println("PF to be  Deducted monthly : " + (int)pfded);

		double cgst = sal * 0.07;

		System.out.println("Cgst to be deductded monthly : " + (int)cgst);

		double allowance = sal * 0.03;

		System.out.println("Allowance to be added monthly : " +(int) allowance);
		
		System.out.println("Montly salary afer all observations : " +(sal-pfded-cgst+allowance));
		System.out.println("\n**********************************\n");
		long AnnualSalary=sal*12;
		double anualpf=pfded*12;
		double anualcgst=cgst*12;
		double anualallow=allowance*12;
		
		
		System.out.println("\nAnnual Salary : "+AnnualSalary);
		
		System.out.println("Annual PF : "+(int)anualpf);
		System.out.println("Annual CGST : "+(int)anualcgst);
		System.out.println("Annual allowance : "+(int)anualallow);
		
		System.out.println("Annual Salary after all observations : "+(AnnualSalary-anualpf-anualcgst+anualallow));

	}

}
