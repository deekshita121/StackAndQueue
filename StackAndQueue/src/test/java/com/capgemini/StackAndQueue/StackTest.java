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
    
    @Test
    public void given3Numbers_AddToStack_PopCompletley() {
		MyNode<Integer> firstNode = new MyNode<Integer>(70);
		MyNode<Integer> secondNode = new MyNode<Integer>(30);
		MyNode<Integer> thirdNode = new MyNode<Integer>(56);
		Stack stack = new Stack();
		stack.push(firstNode);
		stack.push(secondNode);
		stack.push(thirdNode);
		stack.print();
		INode  temp1 = stack.pop();
		stack.print();
		INode  temp2 = stack.pop();
		stack.print();
		INode  temp3 = stack.pop();
		boolean result = thirdNode.equals(temp1) && secondNode.equals(temp2) && firstNode.equals(temp3);
		Assert.assertTrue(result);
	}
}
