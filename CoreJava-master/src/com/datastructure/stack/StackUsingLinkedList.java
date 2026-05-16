package com.datastructure.stack;

import com.datastructure.list.linkedlist.LinkedList;

public class StackUsingLinkedList {

	protected LinkedList l;
	public StackUsingLinkedList() {
		l = new LinkedList();
	}
	public boolean isEmpty(){
		return l.isEmpty();
	}
	public void push(Object o){
        l.insert(o);
    }
    public Object pop(){
        return l.remove();
    }
	public static void main(String[] args) {
		StackUsingLinkedList s = new StackUsingLinkedList();
		Integer j = null;
        int i;
        System.out.println("starting...");
        for(i=0;i<10;i++){
            j = new Integer((int)(Math.random() * 100));
            s.push(j);
            System.out.println("push: " + j);
        }
        while(!s.isEmpty()){
            System.out.println("pop: " + ((Integer)s.pop()));
        }
        System.out.println("Done ;-)");
	}

}
