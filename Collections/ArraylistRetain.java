package com.Collections;
import java.util.ArrayList;
import java.io.PrintStream;
import java.io.OutputStream;
import java.util.Arrays;
public class ArraylistRetain {

	void main() {
		ArrayList arr= new ArrayList(Arrays.asList(1,2,3,4,5));
		
		ArrayList a=new ArrayList();
		
		
		a.addAll(arr);
		
		System.out.println(a);
		
		
	}
}
