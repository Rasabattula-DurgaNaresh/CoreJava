package com.datastructure.sorting.bubble;

public class BubbleSort {
	public static void main(String[] args) {
		int a[] = {5, 1, 6, 2, 4, 3};	
		int i,j,temp;
		System.out.println(a);
		for(i = 0 ; i < a.length ; i++) {
			for(j = 0 ; j < a.length-i-1 ; j++) {
				if(a[j] > a[j+1]){
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		for(i = 0 ; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}
