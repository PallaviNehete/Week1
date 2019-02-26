package com.bridgelabz.datastructure;
public class LinkedList 
{
	private int size;
	private Node start;
	public LinkedList()
	{
		size = 0;
		start = null;
	}
	public boolean isEmpty()
	{
		if(start == null)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public int getListSize()
	{
		return size;
	}
	public void insertionAtFirst(String val)
	{
		Node n;
		n = new Node();
		n.setData(val);
		n.setNext(start);
		start = n;
		size++;
	}
	public void insert(String val)
	{
		Node n,t;
		n = new Node();
		n.setData(val);
		t = start;
		if(t == null)
		{
			start = n;
		}
		else
		{
			while(t.getNext()!= null)
			{
				t = t.getNext();
			}
			t.setNext(n);
		}
		size++;
	}
	public void insertAtPos(String val,int pos)
	{
		if(pos == 1)
			insertionAtFirst(val);
		else if(pos == size+1)
			insert(val);
		else if(pos>1 && pos<=size)
		{
			Node n,t;
			n = new Node(val,null);
			t = start;
			for(int i=1; i<pos-1; i++)
			{
				t = t.getNext();
			}
			n.setNext(t.getNext());
			t.setNext(n);
			size++;
		}
		else
			System.out.println("Insertion not possible at position "+pos);
	}

	public void deleteFirst()
	{
		if(start == null)
			System.out.println("List is Already Empty");
		else
		{
			start = start.getNext();
			size--;
		}
	}
	public void deleteLast()
	{
		if(start == null)
		{
			System.out.println("List Is Already Empty");
		}
		else if(size == 1)
		{
			start = null;
			size--;
		}
		else
		{
			Node t;
			t = start;
			for(int i=1; i<size-1; i++)
			{
				t = t.getNext();
			}
			t.setNext(null);
			size--;
		}
	}
	public void deleteAtPos(int pos)
	{
		if(start == null)
			System.out.println("List is Already Empty");
		else if(pos<1 || pos>size)
			System.out.println("Invalid Position");
		else if(pos == 1)
			deleteFirst();
		else if(pos == size)
			deleteLast();
		else
		{
			Node t,t1;
			t = start;
			for(int i=1; i<pos-1; i++)
				t = t.getNext();
			t1 = t.getNext();
			t.setNext(t1.getNext());
			size--;
		}
	}
	public void delete(String str)
	{
		Node t = start;
		while(t != null) 
		{
			if(str.equalsIgnoreCase(t.getData()))
			{				
				t=t.getNext();
				t.setNext(t.getNext());
			}
		}
	}
	
	public boolean searchString(String val)
	{
		Node t = start;
		while(t != null)
		{
			if(val.compareToIgnoreCase(t.getData()) == 0)
			{
				return true;
			}
			t = t.getNext();
		}
		return false;
	}
	
	public void display()
	{
		Node tempNode = start;
		while(tempNode!= null) 
		{
			System.out.println(tempNode.data+" ");
			tempNode = tempNode.next;
		}
	}

}
