package com.bridgelabz.datastructure;
public class PalindromeDequeClass 
{
	char queue[];
	int front;
	int rear;
	int size;
	
	/** 
	 * constructor to declare variables.
	 */
	public PalindromeDequeClass(int size)
	{
		queue = new char [size];
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
	 * Insert element at First in Deque.
	 * @param element : the item which want to added at first position in Deque.
	 */
	public void addFront(char element)
	{
		if(isFull())
			System.out.println("Deque is full...");
		else
		{
			for(int i=rear; i>front; i--)
			{
				queue[i] = queue[i-1];
			}
			queue[front] = element;
			rear = rear + 1;
		}
	}
	
	/**
	 * Insert element at last in Deque.
	 * @param element : the item which want to added at last position in Deque.
	 */
	public void addRear(char element)
	{
		if(isFull())
			System.out.println("Deque is full...");
		else
		{
			queue[rear] = element;
			rear = rear + 1;
		}
	}
	
	/**
	 * Delete First element from Deque.
	 */
	public char removeFront()
	{
		char temp = 0;
		if(isEmpty())
			System.out.println("Deque is empty...");
		else
		{
			temp = queue[front];
			queue[front] = 0;
			front = front + 1;
		}
		return temp;
		
	}
	
	/**
	 * Delete last element from Deque.
	 */
	public char removeRear()
	{
		char temp = 0;
		if(isEmpty())
			System.out.println("Deque is empty...");
		else
		{
			rear = rear - 1;
			temp = queue[rear];
			queue[rear] = 0;
		}
		return temp;
	}
	
	/**
	 * Display all elements of Deque.
	 */
	public void display()
	{
		//int count = rear - front;
		for(int i=0; i<= rear; i++)
		{
			System.out.println(queue[i]);
		}
	}
}
