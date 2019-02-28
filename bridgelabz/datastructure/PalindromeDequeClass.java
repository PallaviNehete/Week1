package com.bridgelabz.datastructure;
import java.util.Scanner;
public class PalindromeDequeClass 
{
	static int  max=100;
	int arr[];
	int front;
	int rear;
	int size;
	public PalindromeDequeClass(int size)
	{
		arr = new int[max];
		front = -1;
		rear = 0;
		this.size = size;
	}
	boolean isFull()
	{
		return ((front == 0 && rear == size-1) || (front == rear+1));
	}
	boolean isEmpty()
	{
		return (front == -1);
	}
	void insertFront(int key)
	{
		if(isFull())
		{
			System.out.println("Deque is full...");
		}
		if(front == -1)
		{
			front = 0;
			rear = 0;
		}
		else if(front == 0)
		{
			front = size-1;
		}
		else
			front=front-1;
		arr[front]=key;
	}
	void insertRear (int key)
	{
		if(isFull())
		{
			System.out.println("Deque is full...");
		}
		if(front == -1)
		{
			front = 0;
			rear = 0;
		}
		else if(rear == size-1)
			rear = 0;
		else
			rear = rear + 1;
		arr[rear] = key;
	}
	void deleteFront()
	{
		if(isEmpty())
		{
			System.out.println("Deque is Empty...");
		}
		if(front == rear)
		{
			front = -1;
			rear = -1;
		}
		else if(front == size-1)
			front = 0;
		else
			front = front + 1;
	}
	void deleteRear()
	{
		if(isEmpty())
		{
			System.out.println("Deque is Empty...");
		}
		if(front == rear)
		{
			front = -1;
			rear = -1;
		}
		else if(rear == 0)
			rear = size-1;
		else
			rear = rear-1;
	}
	void countPrint()
	{
		if(!isEmpty())
		{
			int count=(rear + size - front) % size+1;
			for(int i=0; i<count; i++)
			{
				int index=(front+i) % size; // Index of element while travesing circularly from front
				System.out.println(arr[i]);
			}
			System.out.println("Count is: "+count);
		}
		else
		{
			System.out.println("Queue is Empty...");
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Size of Array: ");
		int size = sc.nextInt();
		PalindromeDequeClass dc=new PalindromeDequeClass(size);
		//System.out.println(dc.isEmpty());
		//System.out.println(dc.isFull());
		dc.insertFront(8);
		dc.insertFront(5);
		dc.insertFront(6);
		
		//dc.deleteRear();
		//dc.deleteFront();
		dc.countPrint();
	}
}
