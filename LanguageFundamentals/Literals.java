package com.LanguageFundamentals;

class Integralliterals {
	// There are 3 types
	void decimalintegral() {

		byte d = 1;
		short e = 127;
		int a = 1854210;
		long f = 846513824;

	}

	void octaintegral() {
		// evry number starts with 0 considered as octal num
		// ranges from 0-7

		short a = 0123;
		int b = 0456;
		long c = 0654;

//		double d=0856;The literal 0856 of type int is out of range 

	}

	void hexaintegral() {
		// every number starts with 0x or 0X considered as hexa deciaml num
//		ranges from 0-9 , a-f or A-F;

		short a = 0xa;
		int b = 0x756;
		int c = 0x0010;
		int d = 0xbee;
		int f = 0xcea;

//		int g=0xaefg; Syntax error on token "g", delete this token

	}
	
	
	void binaryintegral() {
		int b=0b1010;
	}
	
}

class floatliterals {

	// by default all floating point varibales treated as double

	void floatig() {
		float f1=186;
		float f2=0123;
		float f3=0b1010;
		float f4=0x123;
		float f5 = 0x123f;
		float f6=123.5f;
//		float f6=12.9; Type mismatch: cannot convert from double to float
//		float f6=0x123.5; Invalid hex literal number
		
	}
	
	
}

public class Literals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		 in java there are total 6 types of literals are available and they are
//		1.Integral Literals
//		  1.1 Decimal literlas
//		  1.2 Ocatl Literals
//		  1.3 Hexa Decimal Literals
//		2.Flaot Literals
//		  2.1 float literals
//		  2.2 double literals
//		3.character liter literals
//		   3.1 single quote character literals
//		   3.2 unicode character literals
//		   3.3 ASCII code literals
//		4.String literals
//		  4.1 initialization
//		  4.1 object method
//		5.Boolean Literals
//		6.null Literals

		int n = 0b1010101;
		byte b = 120;
		byte l = 2;
		int c = (b + l);

//	    float f=0x123.5f;

	}

}
