package com.datastructure.stack;

public class ArrayStackObject {
	protected int pointer;
	protected Object [] head;
	public ArrayStackObject(int initialCapacity) {
		head = new Object[initialCapacity];
		pointer = -1;
	}
	public boolean isEmpty() {
		return pointer == -1;
	}
	public void push(Object i) {
		if(pointer+1 < head.length)
			head[++pointer] = i;
	}
	public Object pop() {
		if(isEmpty())
			return 0;
		return head[pointer--];
	}
	public static void main(String[] args) {
		ArrayStackObject s = new ArrayStackObject(10);
		int i;
		String j;
        System.out.println("starting...");
        for(i=0;i<10;i++){
        	 j = "AA"+i;
             s.push(j);
             System.out.println("push: " + j);
        }
        while(!s.isEmpty()){
            System.out.println("pop: " + s.pop());
        }
        System.out.println("Done ;-)");
	}

}
