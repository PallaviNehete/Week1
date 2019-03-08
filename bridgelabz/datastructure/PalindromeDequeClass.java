/**
 * created by: Pallavi Nehete.
 * Date: 04/03/2019.
 * Purpose: To make a Dequeue.
 */

package com.bridgelabz.datastructure;
public class PalindromeDequeClass 
{
	char dqueue[];
	int front;
	int rear;
	int size;
	
	/** 
	 * constructor to declare variables.
	 */
	public PalindromeDequeClass(int size)
	{
		dqueue = new char [size];
		front = 0;
		rear = 0;
		this.size = size;
	}
	
	/**
	 * gives size of an list.
	 * @return : size of list.
	 */
	public int size()
	{
		return size;
	}
	
	/**
	 * checks Linked is Empty or not.
	 * @return : returns true if list is empty otherwise returns false.
	 */
	public boolean isEmpty()
	{
		if(front == rear)
			return true;
		else
			return false;
	}
	
	/**
	 * checks Linked is full or not.
	 * @return : returns true if list is full otherwise returns false.
	 */
	public boolean isFull()
	{
		if(rear == size)
			return true;
		else
			return false;
	}
	
	/**
	 * Insert element at First in Dequeue.
	 * @param element : the item which want to added at first position in Dequeue.
	 */
	public void addFront(char element)
	{
		if(isFull())
			System.out.println("Dequeue is full...");
		else
		{
			for(int i=rear; i>front; i--)
			{
				dqueue[i] = dqueue[i-1];
			}
			dqueue[front] = element;
			rear = rear + 1;
		}
	}
	
	/**
	 * Insert element at last in Dequeue.
	 * @param element : the item which want to added at last position in Dequeue.
	 */
	public void addRear(char element)
	{
		if(isFull())
			System.out.println("Dequeue is full...");
		else
		{
			dqueue[rear] = element;
			rear = rear + 1;
		}
	}
	
	/**
	 * Delete First element from Dequeue.
	 */
	public char removeFront()
	{
		char temp = 0;
		if(isEmpty())
			System.out.println("Dequeue is empty...");
		else
		{
			temp = dqueue[front];
			dqueue[front] = 0;
			front = front + 1;
		}
		return temp;
		
	}
	
	/**
	 * Delete last element from Dequeue.
	 */
	public char removeRear()
	{
		char temp = 0;
		if(isEmpty())
			System.out.println("Dequeue is empty...");
		else
		{
			rear = rear - 1;
			temp = dqueue[rear];
			dqueue[rear] = 0;
		}
		return temp;
	}
	
	/**
	 * Display all elements of Dequeue.
	 */
	public void display()
	{
		//int count = rear - front;
		for(int i=0; i<= rear; i++)
		{
			System.out.println(dqueue[i]);
		}
	}
}
