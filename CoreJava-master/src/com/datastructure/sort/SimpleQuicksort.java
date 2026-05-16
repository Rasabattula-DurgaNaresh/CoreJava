package com.datastructure.sort;

public class SimpleQuicksort {
	 public static void qsort(Comparable[] c,int start,int end){
	        if(end <= start) return;
	        Comparable comp = c[start];
	        int i = start,j = end + 1;
	        for(;;){
	            do i++; while(i<end && c[i].compareTo(comp)<0);
	            do j--; while(j>start && c[j].compareTo(comp)>0);
	            if(j <= i)   break;
	            Comparable tmp = c[i];
	            c[i] = c[j];
	            c[j] = tmp;
	        }
	        c[start] = c[j];
	        c[j] = comp;
	        qsort(c,start,j-1);
	        qsort(c,j+1,end);
	    }

	    public static void qsort(Comparable[] c){
	        qsort(c,0,c.length-1);
	    }

	    public static void main(String[] args){
	        int i;
	        Integer[] arr = new Integer[20];
	        System.out.println("inserting: ");
	        for(i=0;i<arr.length;i++){
	            arr[i] = new Integer((int)(Math.random()*99));
	            System.out.print(arr[i]+" ");
	        }
	        SimpleQuicksort.qsort(arr);
	        System.out.println("\nsorted: ");
	        for(i=0;i<arr.length;i++)
	            System.out.print(arr[i]+" ");
	        System.out.println("\nDone ;-)");
	    }
}
