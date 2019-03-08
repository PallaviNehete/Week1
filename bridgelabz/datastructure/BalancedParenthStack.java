/**
 * created by: Pallavi Nehete.
 * Date: 27/02/2019.
 * Purpose: To Make a stack using array.
 */

package com.bridgelabz.datastructure;
public class BalancedParenthStack 
{
	int size;
	int stack[];
	int top;
	
	/**
	 * Constructor to initialize variables.
	 * @param expressionSize : size of the expression. 
	 */
	public BalancedParenthStack(int expressionSize) 
	{
		size = expressionSize;
		stack = new int[size];
		top = 0;
	}
	
	/**
	 * Method to get Size of a stack.
	 * @return : size of a stack.
	 */
	public int getSize()
	{
		return top;
	}
	
	/**
	 * Method to check whether stack is empty or not.
	 * @return : return true if stack is empty otherwise gives false.
	 */
	public boolean isEmpty()
	{
		return top<=0;
	}
	
	/**
	 * Method to push data into stack.
	 * @param data : data which want to push in stack.
	 */
	public void push(int data)
	{
		if(top == size)
			System.out.println("Stack is full");
		else
		{
			stack[top] = data;
			top++;
		}
	}
	
	/**
	 * Method to remove and return last element from stack.
	 * @return : last element from list.
	 */
	public int pop()
	{
		int data = 0;
		if(isEmpty())
			System.out.println("Stack is Empty");
		else
		{
			top--;
			data = stack[top];
			stack[top] = 0;
		}
		return data;
	}
	
	/**
	 * Method to last element from stack.
	 * @return : last element from list.
	 */
	public int peek()
	{
		int data;
		data = stack[top-1];
		return data;
	}
	
	/**
	 * Method to display all elements of stack.
	 */
	public void display()
	{
		for(int element:stack)
		{
			System.out.print(element+" ");
		}
	}
}
