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
    public void given3Numbers_WhenAddedToStack_ShouldBeAddedToTop() {
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
}