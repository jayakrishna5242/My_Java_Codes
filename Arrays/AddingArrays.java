package com.Arrays;

import java.util. Arrays;
public class AddingArrays {

	
	
	void main() {
		int a1[]= {1,2,3,4};
		int a2[]= {5,6,9,7,2,5};
		int a3[]=new int[a1.length+a2.length];
		int c=0;
		for(int x:a1) {
			a3[c]=a1[c];
			c++;
		}
		int i=0;
		for(int x:a2) {
			a3[c]=a2[i];
			c++;
			i++;
		}	
		
		System.out.println(a3.toString());
		for(int x:a3) {
			System.out.print(x+" ");
		}
	}
	
}
