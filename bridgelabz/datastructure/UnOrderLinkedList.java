package com.bridgelabz.datastructure;

import java.io.File;

public class UnOrderLinkedList 
{
	int size;
	Node<String> start;
	public UnOrderLinkedList()
	{
		size = 0;
		start = null;
	}
	public boolean isEmpty()
	{
		if(start == null)
			return true;
		else
			return false;
	}
	public int getListSize()
	{
		return size;
	}

	// Insert element at First.		add
	public void add(String data)
	{
		Node<String> node;
		node = new Node<String>();
		node.setData(data);
		node.setNext(start);
		start = node;
		size++;
	}

	// Insert element at Last.		append
	public void append(String data)
	{
		Node<String> node;
		Node<String> temp;
		node = new Node<String>();
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

	// Insert element at given position.
	public void insertAtPos(String data, int position)
	{
		if(position == 1)
			add(data);
		else if(position == size+1)
			append(data);
		else if(position>1 && position<=size)
		{
			Node<String> n,t;
			n = new Node<String>(data ,null);
			t = start;
			for(int i=1; i<position-1; i++)
				t = t.getNext();
			n.setNext(t.getNext());
			t.setNext(n);
			size++;
		}
		else
			System.out.println("Insertion not possible at position "+position);
	}

	// delete First element.
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

	//delete Last element.
	public void deleteLast()
	{
		if(start == null)
			System.out.println("List Is Already Empty");
		else if(size == 1)
		{
			start = null;
			size--;
		}
		else
		{
			Node<String> t;
			t = start;
			for(int i=1; i<size-1; i++)
				t = t.getNext();
			t.setNext(null);
			size--;
		}
	}

	// delete element from given position.
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
			Node<String> t,t1;
			t = start;
			for(int i=1; i<pos-1; i++)
				t = t.getNext();
			t1 = t.getNext();
			t.setNext(t1.getNext());
			size--;
		}
	}

	// Remove element.
	public void remove(String s)
	{
		Node<String> current = start;				
		Node<String> previous = null;
		while (current != null)			
		{
			if (current.data.equals(s))			
			{
				if (previous == null)		
					start = current.next;
				else							
					previous.next = current.next;
			}
			previous = current;
			current = current.next;
		}
		size--;
	}

	// removes and return last element.	
	public String pop()
	{
		Node<String> t = start;
		String s = null;
		if(start == null)
		{
			System.out.println("List Is Already Empty");
		}
		else if(size == 1)
		{
			start = start.next;
			size--;
			return (String) t.data;
		}
		else
		{
			t = start;
			for(int i=1; i<size-1; i++)
			{
				s=(String) t.data;
				t = t.getNext();
			}
			s=(String) t.getData();
			t.setNext(null);
			size--;
		}
		return (String) t.data;
	}

	// removes and return position element.	
	public String pop(int pos)
	{
		int index = 0;
		Node<String> n = start;
		if (pos == 0) 
		{
			start = start.next;
			size--;
			return (String) n.data;
		}
		Node<String> prev = null;
		while (index != pos)
		{
			prev = n;
			n = n.next;
			index++;
		}
		prev.next = n.next;
		size--;
		return (String) n.data;
	}
	public boolean searchString(String val)
	{
		Node<String> t = start;
		while(t != null)
		{
			if(val.compareToIgnoreCase((String) t.getData()) == 0)
				return true;
			t = t.getNext();
		}
		return false;
	}

	public void display()
	{
		if(isEmpty())
			System.out.println("List is Empty");
		else
		{
			Node<String> tempNode = start;
			while(tempNode!= null) 
			{
				System.out.print(tempNode.data+" ");
				tempNode = tempNode.next;
			}
		}
	}
}
