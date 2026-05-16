package com.datastructure.queue;

import com.datastructure.list.linkedlist.LinkedList;

public class QueueUsingLinkedList {
	protected LinkedList l;

    public QueueUsingLinkedList(){
        l = new LinkedList();
    }
    public boolean isEmpty(){
        return l.isEmpty();
    }
    public void insert(Object o){
        l.insert(o);
    }
    public Object remove(){
        return l.removeEnd();
    }
	public static void main(String[] args) {
		QueueUsingLinkedList q = new QueueUsingLinkedList();
		Integer j = null;
        int i;
        System.out.println("starting...");
        for(i=0;i<10;i++){
            j = new Integer((int)(Math.random() * 100));
            q.insert(j);
            System.out.println("insert: " + j);
        }
        while(!q.isEmpty()){
            System.out.println("remove: " + ((Integer)q.remove()));
        }
        System.out.println("Done ;-)");
	}

}
