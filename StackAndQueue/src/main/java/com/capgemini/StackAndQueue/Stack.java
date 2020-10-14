package com.capgemini.StackAndQueue;

public class Stack {

	private MyLinkedList myLinkedList;
	public Stack() {
		myLinkedList = new MyLinkedList();
	}
	
	public void push(INode newNode) {
		myLinkedList.add(newNode);
	}

	public INode peak() {
		return myLinkedList.head;
	}
	
	public void print() {
		myLinkedList.printNodes();
	}
}
