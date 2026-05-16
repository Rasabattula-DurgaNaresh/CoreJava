package com.datastructure.stack;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ArrayStackOfStrings {
	//To hole elements of Stack
	private String [] a;
	//Number of items in Stack
	private int N;
	
	public ArrayStackOfStrings(int max) {
		a = new String[max];
	}
	
	//To check if stack is empty
	public boolean isEmpty() {
		return N == 0;
	}
	
	public void push(String item) {
		item = a[N++];
	}
	
	public String pop() {
		return a[--N];
	}

	public class ArrayIterator implements Iterator<String> {
		int i = N-1;
		@Override
		public boolean hasNext() {
			return i >= 0;
		}

		@Override
		public String next() {
			if(!hasNext())
				throw new NoSuchElementException();
			return a[i--];
		}

		@Override
		public void remove() {
			throw new UnsupportedOperationException();
		}
		
	}
	
	 public static void main(String[] args) {
		 int max = Integer.parseInt(args[0]);
		 ArrayStackOfStrings stack = new ArrayStackOfStrings(max);
	 }
}
