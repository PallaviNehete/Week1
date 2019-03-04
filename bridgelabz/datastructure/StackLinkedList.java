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
	public Object peek()
	{
		if(isEmpty())
			System.out.println("List is Empty");
		else
			return top.data;
		return -1;
	}
	
	/**
	 * function to add data in the stack at top position.
	 * @param data : data which want to add in stack.
	 */
	public void push(Object data)
	{
		Node node;
		node = new Node();
		node.setData(data);
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
	/*public static void main(String[] args) {
		StackLinkedList s = new StackLinkedList();
		s.push(2);
		s.push(5);
		s.push(8);
		s.push(9);
		s.push(10);
		s.display();
		System.out.println();
		s.display();
		System.out.println();
		System.out.println(s.peek());
		System.out.println(s.isEmpty());
	}*/
}
