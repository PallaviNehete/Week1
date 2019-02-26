
package com.bridgelabz.datastructure;
public class QueueClass 
{
	int maxSize = 50;
	int queue[] = new int[maxSize];
	int front, rear;

	// Constructor is to set front and rear as -1. 
	// We are assuming that for an empty Queue, both front and rear will be -1.
	public QueueClass() 
	{
		front = -1; 
		rear = -1;
	}
	// To check wheter Queue is empty or not
	boolean IsEmpty()
	{
		if(front == -1 && rear == -1)
			return true;
		else
			return false;
	}

	// To check whether Queue is full or not
	boolean IsFull()
	{
		//return (rear+1)%maxSize == front ? true : false;
		if((rear+1)% maxSize == front)
			return true;
		else
			return false;
	}
	void Enqueue(int e)
	{
		if(IsFull())
		{
			System.out.println("Queue is Full");

		}
		if(IsEmpty())
		{
			front = rear = 0;
		}
		else
		{
			rear = (rear+1) % maxSize;
		}
		queue[rear] = e;
	}
	// Removes an element in Queue from front end. 
	void Dequeue(int d)
	{
		if(IsEmpty())
		{
			System.out.println("Queue is Empty");
		}
		else if(front == rear)				// Queue has only 1 element
		{
			front = rear = -1;				// Queue is empty
		}
		else
		{
			front = (front+1) % maxSize;
		}
	}
	void countPrint()
	{
		if(!IsEmpty())
		{
			int count = (rear + maxSize - front) % maxSize+1;
			/*for(int i=0; i<count; i++)
			{
				int index=(front+i) % maxSize; // Index of element while travesing circularly from front
				System.out.println(queue[i]);
			}*/
			System.out.println(count+" Peoples are in queue.");
		}
		else
		{
			System.out.println("Queue is Empty...");
		}
	}
}
