package com.capgemini.StackAndQueue;

public class Queue {

	private MyLinkedList myLinkedList;
	public Queue() {
		myLinkedList = new MyLinkedList();
	}
	
	public void enqueue(INode newNode) {
		myLinkedList.append(newNode);
	}

	public INode peak() {
		return myLinkedList.head;
	}
	
	public INode dequeue() {
		return myLinkedList.pop();
	}
	
	public void print() {
		myLinkedList.printNodes();
	}
}
