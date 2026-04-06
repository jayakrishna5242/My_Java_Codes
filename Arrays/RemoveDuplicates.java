package com.Arrays;

public class RemoveDuplicates {

	void main() {
		System.out.println("Opening Thread Found : ");
		int[] y= {1, 2, 5, 5, 4, 7, 3, 9, 2 };
		int[] x=findDup(y);
		for(int c:x) {
			System.out.print(c+" ");
		}
		
		
	}
	
	int[] findDup(int[] arr) {
		
		
		int[] arr1=new int[arr.length];
		arr1=arr.clone();	
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					arr1[j]=0;
					System.out.print(arr[j]+" ");
				}
			}
			
		}
		int c=0;
		for(int x:arr1) {
			if(x!=0) {
				c++;
			}
		}
		int[] arr2=new int[c];
		int n=0;
		for(int a:arr1) {
			if(a!=0) {
				arr2[n]=a;
				n++;
			}
		}
	
		System.out.println();
		return arr2;
	
	
	}
}
