package com.capgemini.StackAndQueue;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class MyLinkedList {

	private static final Logger log = LogManager.getLogger(MyLinkedList.class);
	public INode head;
	public INode tail;

	public MyLinkedList() {
		this.head = null;
		this.tail = null;
	}

	public void add(INode newNode) {
		if (this.tail == null)
			this.tail = newNode;
		if (this.head == null)
			this.head = newNode;
		else {
			INode tempNode = this.head;
			this.head = newNode;
			this.head.setNext(tempNode);
		}
	}

	public void append(INode newNode) {
		if (this.tail == null)
			this.tail = newNode;
		if (this.head == null)
			this.head = newNode;
		else {
			this.tail.setNext(newNode);
			this.tail = newNode;
		}
	}

	public void insertAt(INode myNode, INode newNode) {
		newNode.setNext(myNode.getNext());
		myNode.setNext(newNode);

	}

	public INode pop() {
		INode temp = head;
		this.head = temp.getNext();
		return temp;
	}

	public void popLast() {
		INode tempNode = head;
		while (!tempNode.getNext().equals(tail))
			tempNode = tempNode.getNext();
		this.tail = tempNode;
		tempNode = tempNode.getNext();
		this.tail.setNext(null);

	}

	public INode search(INode myNode) {
		INode tempNode = head;
		while (tempNode != null) {
			if (tempNode == myNode)
				break;
			else
				tempNode = tempNode.getNext();
		}
		return tempNode;
	}

	public void searchInsert(INode newNode, int number) {
		INode tempNode = head;
		while (tempNode != null) {
			int n = (int) tempNode.getKey();
			if (n == number) {
				newNode.setNext(tempNode.getNext());
				tempNode.setNext(newNode);
			}
			tempNode = tempNode.getNext();
		}
	}
	
	public void searchDelete(int number) {
		INode tempNode = head;
		INode prevNode = null;
		while (tempNode.getNext() != null) {
			int n = (int) tempNode.getKey();
			if (n == number) {
				prevNode.setNext(tempNode.getNext());
				
			}
			prevNode = tempNode;
			tempNode = tempNode.getNext();
		}
	}
	
	public int size() {
	    INode tempNode = head;
	    int count = 0;
	    while(tempNode!=null) {
	    	count++;
	    	tempNode = tempNode.getNext();
	    }
	    return count;
	}

	public void printNodes() {
		StringBuffer nodes = new StringBuffer("My Nodes: ");
		INode tempNode = head;
		while (tempNode.getNext() != null) {
			nodes.append(tempNode.getKey());
			nodes.append("->");
			tempNode = tempNode.getNext();
		}
		nodes.append(tempNode.getKey());
		log.info(nodes);
	}
}
