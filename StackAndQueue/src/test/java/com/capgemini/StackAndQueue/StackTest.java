package com.capgemini.StackAndQueue;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class StackTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void given3Numbers_WhenAddedToStack_ShouldBeAddedToTop() {
		MyNode<Integer> firstNode = new MyNode<Integer>(70);
		MyNode<Integer> secondNode = new MyNode<Integer>(30);
		MyNode<Integer> thirdNode = new MyNode<Integer>(56);
		Stack stack = new Stack();
		stack.push(firstNode);
		stack.push(secondNode);
		stack.push(thirdNode);
		INode<Integer> myNode = stack.peak();
		stack.print();
		boolean result = thirdNode.equals(myNode);
		Assert.assertTrue(result);
	}
}
