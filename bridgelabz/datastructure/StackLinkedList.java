// LIFO.

package com.bridgelabz.datastructure;
public class StackLinkedList 
{
	int size;
	Node top;
	
	/**
	 * constructor
	 */
	public StackLinkedList()
	{
		this.top = null;
	}
	
	/**
	 * gives size of an stack.
	 * @return : size of stack.
	 */
	public int getListSize()
	{
		return size;
	}
	
	/**
	 * checks stack is Empty or not.
	 * @return : returns true if list is empty otherwise returns false.
	 */
	public boolean isEmpty()
	{
		if(top == null)
			return true;
		else
			return false;
	}
	
	/**
	 * function to return top element in a stack 
	 * @return : top element of stack.
	 */
	public int peek()
	{
		if(isEmpty())
			System.out.println("List is Empty");
		else
			return (int) top.data;
		return -1;
	}
	
	/**
	 * function to add data in the stack at top position.
	 * @param data : element which want to add in stack.
	 */
	public void push(Object element)
	{
		Node node;
		node = new Node();
		node.setData(element);
		node.setNext(top);
		top = node;
		size++;
	}
	
	/**
	 * function to remove data from top position of stack.
	 */
	public void pop()
	{
		if(top == null)
			System.out.println("List is Already Empty");
		else
		{
			top = top.getNext();
			size--;
		}
	}
	
	/**
	 * Method to get a data of given position. 
	 * @param position : position.
	 * @return : returns data of given position.
	 */
	public int get(int position)
	{
		int index = 0;
		Node node = top;
		if (position == 0) 
			return (int) node.data;
		Node prev = null;
		while (index != position)
		{
			prev = node;
			node = node.next;
			index++;
		}
		return (int)node.data;
	}
	
	/**
	 * function to display all elements of stack.
	 */
	public void display()
	{
		if(isEmpty())
			System.out.println("List is Empty");
		else
		{
			Node tempNode = top;
			while(tempNode!= null) 
			{
				System.out.print(tempNode.data+" ");
				tempNode = tempNode.next;
			}
		}
	}
}
