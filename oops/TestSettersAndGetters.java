package com.oops;

import java.util.Scanner;

class Students {
	String name;
	int id;
	String branch;
	int yop;

}

public class TestSettersAndGetters {

	void display(Students s) {
		System.out.println(s.id + " " + s.name + " " + s.branch + " " + s.yop);
	}

	void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Students[] arr = new Students[2];
		for (int i = 0; i < 1; i++) {
			Students s = new Students();
			System.out.println("Enter stdent name");
			s.name = sc.nextLine();
			System.out.println("Enter stdent Branch");
			s.branch = sc.nextLine();
			System.out.println("Enter stdent id");
			s.id = sc.nextInt();
			System.out.println("Enter stdent yop");
			s.yop = sc.nextInt();
			arr[i] = s;
			sc.nextLine();
		}
		SettersAndGetters s1 = new SettersAndGetters();
		s1.setName(arr[0].name);
		s1.setBranch(arr[0].branch);
		s1.setId(arr[0].id);
		s1.setYop(arr[0].yop);
		System.out.println(s1.getId());
		System.out.println( s1.getName());
		System.out.println(s1.getBranch());
		System.out.println( s1.getYop());

	}

}
