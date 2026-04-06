package com.java8;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

class Mobile {
	private String model;
	private int price;

	Mobile(String model, int price) {
		this.model = model;
		this.price = price;
	}

	String getModel() {
		return model;
	}

	int getPrice() {
		return price;
	}

	public String toString() {
		return "Mobile :" + model + " Price : " + price;
	}
}

public class LambdaComparator {

	void main() {

		Mobile m1 = new Mobile("IQOO 13", 44999);
		Mobile m2 = new Mobile("VIVO X 300", 45999);
		Mobile m3 = new Mobile("IQOO 15", 74999);

		Comparator<Mobile> c =

				(m, n) -> {
					return n.getPrice() - m.getPrice();

				};

		List<Mobile> l = new LinkedList();
		l.add(m3);
		l.add(m2);
		l.add(m1);
		Collections.sort(l, c);

		System.out.println(l);
	}

}
