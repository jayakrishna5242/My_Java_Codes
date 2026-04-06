package com.Java_Practice;
import java.util.Arrays;
import  java.util.Scanner;
public class IsomorphicString {

	void main() {
		int[] arr1=new int[127];
		int[] arr2=new int[127];
		String s1="aaabbbccc";
		String s2="xxxyyzyzz";
		for(int i=0;i<s1.length();i++) {
			arr1[s1.charAt(i)]=arr1[s1.charAt(i)]+1;
		}
		for(int i=0;i<s2.length();i++) {
			arr2[s1.charAt(i)]=arr2[s1.charAt(i)]+1;
		}
		
		
	
		
		String s3="";
		String s4="";
		for(int i: arr1) if (i!=0 ) s3+=i;
		for(int i: arr2) if (i!=0 ) s4+=i;
		System.out.println(s3.equals(s4));

		if(s3.equals(s4)) System.out.println("Isomorphic");
		else System.out.println("Not Iso Morphic");

		
		
	

		
		
	}
}
