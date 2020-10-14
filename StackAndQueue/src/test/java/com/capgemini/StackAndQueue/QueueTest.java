package com.capgemini.StackAndQueue;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class QueueTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void given3Numbers_WhenAddedToQueue() {
		MyNode<Integer> firstNode = new MyNode<Integer>(56);
		MyNode<Integer> secondNode = new MyNode<Integer>(30);
		MyNode<Integer> thirdNode = new MyNode<Integer>(70);
		Queue queue = new Queue();
		queue.enqueue(firstNode);
		queue.enqueue(secondNode);
		queue.enqueue(thirdNode);
		INode myNode = queue.peak();
		queue.print();
		boolean result = firstNode.equals(myNode);
		Assert.assertTrue(result);
	}
    
    @Test
    public void given3Numbers_WhenAddedToQueue_Pop() {
		MyNode<Integer> firstNode = new MyNode<Integer>(56);
		MyNode<Integer> secondNode = new MyNode<Integer>(30);
		MyNode<Integer> thirdNode = new MyNode<Integer>(70);
		Queue queue = new Queue();
		queue.enqueue(firstNode);
		queue.enqueue(secondNode);
		queue.enqueue(thirdNode);
		queue.print();
		INode  temp1 = queue.dequeue();
		queue.print();
		INode  temp2 = queue.dequeue();
		queue.print();
		INode  temp3 = queue.dequeue();
		boolean result = thirdNode.equals(temp3) && secondNode.equals(temp2) && firstNode.equals(temp1);
		Assert.assertTrue(result);
	}
}