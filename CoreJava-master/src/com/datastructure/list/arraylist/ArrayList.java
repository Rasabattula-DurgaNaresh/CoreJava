package com.datastructure.list.arraylist;

public class ArrayList {
	
	protected Object [] array;
	protected int start, end, number;

	public ArrayList(int maxsize) {
		array = new Object[maxsize];
		start = end = number;
	}
	public boolean isEmpty() {
		return number == 0;
	}
	public boolean isFull() {
		return number >= array.length;
	}
	public int size() {
		return number;
	}
	public void insert(Object obj) {
		if(number < array.length)
			array[start = ++start % array.length] = obj;
		number++;
	}
	public void insertEnd(Object obj) {
		if(number  < array.length)
			array[end] = obj;
		end = ++end % array.length;
		number++;
	}
	public Object remove(){
        if(isEmpty())
            return null;
        number--;
        int i = start;
        start = (--start + array.length) % array.length;
        return array[i];
    }
	public Object removeEnd() {
		if(isEmpty())
			return null;
		number --;
		return array[end = --end % array.length];
	}
	 public Object peek(int n){
	        if(n >= number)
	            return null;
	        return array[(end + 1 + n) % array.length];
	    }
	public static void main(String[] args) {
		ArrayList l = new ArrayList(10);
        Integer j = null;
        int i;
        System.out.println("starting...");
        for(i=0;i<5;i++){
            j = new Integer((int)(Math.random() * 100));
            l.insert(j);
            System.out.println("insert: " + j);
        }
        while(!l.isFull()){
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
