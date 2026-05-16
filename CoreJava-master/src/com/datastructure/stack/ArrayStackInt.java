package com.datastructure.stack;

public class ArrayStackInt {

	protected int head[];
    protected int pointer;
    
    public ArrayStackInt(int capacity) {
    	head = new int[capacity];
    	pointer = -1;
    }
    public boolean isEmpty() {
    	return pointer == -1;
    }
    public void push(int i) {
    	if(pointer+1 < head.length) {
    		head[++pointer] = i;
    	}
    }
    public int pop() throws Exception {
    	if(isEmpty())
    		throw new Exception("Stack is empty");
    	return head[pointer--];
    }
	public static void main(String[] args) throws Exception {
		ArrayStackInt s = new ArrayStackInt(10);
		int i,j;
        System.out.println("starting...");
        for(i=0;i<10;i++){
            j = (int)(Math.random() * 100);
            s.push(j);
            System.out.println("push: " + j);
        }
        while(!s.isEmpty()){
            System.out.println("pop: " + s.pop());
        }
        System.out.println("Done ;-)");
	}

}
