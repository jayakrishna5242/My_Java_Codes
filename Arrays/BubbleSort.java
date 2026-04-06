package com.Arrays;

public class BubbleSort {

	int[] bubbleSort(int[] arr) {
		int count=0;
		int k=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					count++;
					k++;
				}
			}
			if(k==0) {
				break;
			}
		}
		System.out.println(count);
		return arr;
	}

	
	
	void main() {
		int[] arr = { 12, 8, 45, 8, 34, 90 };
		int[] x=bubbleSort(arr);
		for(int y:x)System.out.print(y+" ");
	}

}
