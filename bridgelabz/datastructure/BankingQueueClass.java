/**
 * created by: Pallavi Nehete.
 * Date: 27/02/2019.
 * Purpose: To make a Queue using array. 
 */

package com.bridgelabz.datastructure;
public class BankingQueueClass 
{
	int maxSize = 50;
	int queue[] = new int[maxSize];
	int front, rear;

	/**
	 * Constructor to initialize variables.
	 */
	public BankingQueueClass() 
	{
		front = -1; 
		rear = -1;
	}

	/**
	 * Method to check whether Queue is empty or not.
	 * @return : return true if Queue is empty otherwise gives false.
	 */
	public boolean IsEmpty()
	{
		if(front == -1 && rear == -1)
			return true;
		else
			return false;
	}

	/**
	 * Method to check whether Queue is full or not.
	 * @return : return true if Queue is full otherwise gives false.
	 */
	public boolean IsFull()
	{
		if((rear+1)% maxSize == front)
			return true;
		else
			return false;
	}

	/**
	 * Method to add an element at rear.
	 * @param element : element which want to add in Queue.
	 */
	public void Enqueue(int element)
	{
		if(IsFull())
			System.out.println("Queue is Full");
		if(IsEmpty())
			front = rear = 0;
		else
			rear = (rear+1) % maxSize;
		queue[rear] = element;
	}

	/**
	 * Method to remove an element from front end.
	 */
	public void Dequeue()
	{
		if(IsEmpty())
			System.out.println("Queue is Empty");
		else if(front == rear)				// Queue has only 1 element
			front = rear = -1;				// Queue is empty
		else
			front = (front+1) % maxSize;
	}

	/**
	 * Method to count elements of a Queue.
	 */
	public int count()
	{
		int count = 0;
		if(!IsEmpty())
			count = (rear + maxSize - front) % maxSize + 1;
		return count;
	}
	
	public static void main(String[] args) 
	{
		BankingQueueClass b = new BankingQueueClass();
		System.out.println(b.IsEmpty());
		System.out.println(b.IsFull());
		b.Enqueue(5);
		b.Enqueue(4);
		b.Enqueue(9);
		System.out.println(b.count());
		b.Dequeue();
		System.out.println(b.count());
	}
}
