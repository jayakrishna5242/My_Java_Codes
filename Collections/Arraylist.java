package com.Collections;
import java.util.ArrayList;
public class Arraylist {
	void main() {
		ArrayList arr=new ArrayList();
		arr.add(5);
		arr.add("jaya");
		arr.add("Krishna");
		arr.add(10);
		int count=0;
		System.out.println(arr);
		for(int i=0;i<arr.size();i++) {
			arr.remove(i);
			count++;
		}
		System.out.println(arr);
		System.out.println(count);
	}
	
}
