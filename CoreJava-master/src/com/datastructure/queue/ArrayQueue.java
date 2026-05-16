package com.datastructure.queue;

public class ArrayQueue {
	protected Object [] array;
	protected int start, end;
	protected boolean full;
	public ArrayQueue(int max) {
		array = new Object[max];
		start = end = 0;
		full = false;
	}
	public boolean isEmpty() {
		return (start == end && !full);
	}
	public void insert(Object obj) {
		System.out.println("Start : "+start);
		if(!full)
			array[start = (++start % array.length)] = obj;
		
		if(start == end)
			full = true;
	}
	public Object remove() throws Exception {
		if(full)
			full = false;
		else if (isEmpty())
		 throw new Exception("Stack is empty");
		System.out.println("End : "+end);
		return array[end = ++end % array.length];
	}
	public static void main(String[] args) throws Exception {
		ArrayQueue q = new ArrayQueue(10);
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
