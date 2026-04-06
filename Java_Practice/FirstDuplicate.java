package com.Java_Practice;

public class FirstDuplicate {

	
	void main() {
		
		
		String s="banana";
		boolean c=false;
		for(int i=0;i<s.length()-1;i++) {
			for(int j=i+1;j<s.length();j++) {
				if(s.charAt(i)==s.charAt(j)) {
					System.out.println("repetead character : "+s.charAt(i));
					c=true;
					break;
				}
				
			}
			if(c) {
				break;
			}
		}
		
		s=s.toLowerCase();
		int count=0;
		for (int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch=='a'|| ch=='e'||ch=='i'|| ch=='o'||ch=='u') {
				count++;
				
			}
		}
		
		System.out.println("Vowel count : "+count);
	}
	
}
