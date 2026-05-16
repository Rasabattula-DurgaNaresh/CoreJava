package com.datastructure.list.linkedlist;

public class LinkedList {

	protected OneChildNode head;
	protected int number;
	public LinkedList() {
		head = null;
		number = 0;
	}
	public boolean isEmpty() {
		return head==null;
	}
	public int size() {
		return number;
	}
	public void insert(Object obj){
        head = new OneChildNode(obj,head);
        number++;
    }
    public Object remove(){
        if(isEmpty())
            return null;
        OneChildNode tmp = head;
        head = tmp.getNext();
        number--;
        return tmp.getData();
    }
    public void insertEnd(Object obj){
        if(isEmpty())
            insert(obj);
        else{
            OneChildNode t = head;
            while(t.getNext() != null)
                t=t.getNext();
            OneChildNode tmp = new OneChildNode(obj,t.getNext());
            t.setNext(tmp);
            number++;
        }
    }
    public Object removeEnd(){
        if(isEmpty())
            return null;
        if(head.getNext() == null)
            return remove();
        OneChildNode t = head;
        while(t.getNext().getNext() != null)
            t = t.getNext();
        Object obj = t.getNext().getData();
        t.setNext(t.getNext().getNext());
        number--;
        return obj;
    }
    public Object peek(int n){
        OneChildNode t = head;
        for(int i = 0;i<n && t != null;i++)
            t = t.getNext();
        return t.getData();
    }
	public static void main(String[] args) {
		LinkedList l = new LinkedList();
        Integer j = null;
        int i;
        System.out.println("starting...");
        for(i=0;i<5;i++){
            j = new Integer((int)(Math.random() * 100));
            l.insert(j);
            System.out.println("insert: " + j);
        }
        for(;i<10;i++){
            j = new Integer((int)(Math.random() * 100));
            l.insertEnd(j);
            System.out.println("insertEnd: " + j);
        }
        for(i=0;i<l.size();i++)
            System.out.println("peek "+i+": "+l.peek(i));
        for(i=0;i<5;i++)
            System.out.println("remove: " + ((Integer)l.remove()));
        while(!l.isEmpty())
            System.out.println("removeEnd: " + ((Integer)l.removeEnd()));
        System.out.println("Done ;-)");
	}
}

class OneChildNode {
	protected Object data;
	protected OneChildNode next;
	
	public OneChildNode() {
		data = null;
		next = null;
	}
	public OneChildNode(Object d, OneChildNode n) {
		data = d;
		next = n;
	}
	/**
	 * @return the data
	 */
	public Object getData() {
		return data;
	}
	/**
	 * @param data the data to set
	 */
	public void setData(Object data) {
		this.data = data;
	}
	/**
	 * @return the next
	 */
	public OneChildNode getNext() {
		return next;
	}
	/**
	 * @param next the next to set
	 */
	public void setNext(OneChildNode next) {
		this.next = next;
	}
	
}