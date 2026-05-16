package com.datastructure.sorting.bubble;

public class BubbleSortMod {

	public static void main(String[] args) {
		int [] a = {5, 1, 6, 2, 4, 3};
		int i,j,temp;
		int flag = 0;
		for(i = 0 ; i < a.length; i++) {
			//int flag = 0;
			for(j = 0 ; j < a.length-i-1 ; j++) {
			//	int flag = 0;
				if(a[j] > a[j+1]) {
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
					flag = 1;
				}
				if(flag == 0) {
					break;
				}
			}
		}
		for(i = 0 ; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

}
