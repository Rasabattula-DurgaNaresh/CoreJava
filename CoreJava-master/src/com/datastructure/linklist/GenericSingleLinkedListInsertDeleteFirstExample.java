package com.datastructure.linklist;

class LinkedListEmptyException extends RuntimeException {
	public LinkedListEmptyException() {
		super();
	}
	public LinkedListEmptyException(String message) {
		super(message);
	}
}
class Node<T> {
	public T data;
	public Node<T> next;
	public Node(T data) {
		this.data = data;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	public Node<T> getNext() {
		return next;
	}
	public void setNext(Node<T> next) {
		this.next = next;
	}
	public void displayNode() {
		System.out.println(data+" ");
	}
}

class SingleLinkedList<T> {
	Node<T> first;
	public SingleLinkedList() {
		first = null;
	}
	public void insertFirst(T data) {
		Node<T> newNode = new Node<T>(data);
		newNode.next = first;
		first = newNode;
	}
	public Node<T> deleteFirst() {
		if(first == null)
			throw new LinkedListEmptyException("Linked link doesn't have any nodes.");
		Node<T> tempNode = first;
		first = first.next;
		return tempNode;
		
	}
	
}

public class GenericSingleLinkedListInsertDeleteFirstExample {
	
}
