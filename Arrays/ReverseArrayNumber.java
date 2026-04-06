package com.Arrays;

public class ReverseArrayNumber {

	int[] findRevArray(int[] a) {
		int[] rev = new int[a.length];
		for (int i=0;i<a.length;i++) {
			int revnum=0;
			int num=a[i];
			while(num!=0) {
				int rem=num%10;
				revnum=revnum*10+rem;
				num/=10;
			}
			rev[i]=revnum;
			
		}
		return rev;
	}

	void main() {

		int[] arr = { 12, 309, 44, 19 };
		int[] arrRev=findRevArray(arr);
		for(int x: arrRev) {
			System.out.print(x+" ");
		}
	}

}
