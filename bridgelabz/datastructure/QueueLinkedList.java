/**
 * created by: Pallavi Nehete.
 * Date: 05/03/2019.
 * Purpose: To create Linked list using Queue. (FIFO)
 */

package com.bridgelabz.datastructure;
public class QueueLinkedList 
{
	int size;
	Node start;
	
	/** 
	 * constructor to declare variables.
	 */
	public QueueLinkedList()
	{
		size = 0;
		start = null;
	}
	
	/**
	 * checks Linked is Empty or not.
	 * @return : returns true if list is empty otherwise returns false.
	 */
	public boolean isEmpty()
	{
		if(start == null)
			return true;
		else
			return false;
	}
	
	/**
	 * gives size of an list.
	 * @return : size of list.
	 */
	public int getListSize()
	{
		return size;
	}

	/**
	 * method to insert data at last in Queue.
	 * @param data : data which want to insert in Queue.
	 */
	public void enqueue(Object data)
	{
		Node node, temp;
		node = new Node();
		node.setData(data);
		temp = start;
		if(temp == null)
			start = node;
		else
		{
			while(temp.getNext()!= null)
				temp = temp.getNext();
			temp.setNext(node);
		}
		size++;
	}
	
	/**
	 * method to Remove First element from Queue.
	 */
	public void dequeue()
	{
		if(start == null)
			System.out.println("List is Already Empty");
		else
		{
			start = start.getNext();
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
		Node node = start;
		if (position == 0) 
			return (int)node.data;
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
	 * method to display all elements of an Linked list. 
	 */
	public void display()
	{
		if(isEmpty())
			System.out.println("List is Empty");
		else
		{
			Node tempNode = start;
			while(tempNode!= null) 
			{
				System.out.print(tempNode.data+"\t");
				tempNode = tempNode.next;
			}
		}
	}
	
	/**
	 * Method to get a data of given position. 
	 * @param position : position.
	 * @return : returns data of given position.
	 */
	public Object getObject(int position)
	{
		int index = 0;
		Node node = start;
		if (position == 0) 
			return (int)node.data;
		Node prev = null;
		while (index != position)
		{
			prev = node;
			node = node.next;
			index++;
		}
		return node.data;
	}
}
