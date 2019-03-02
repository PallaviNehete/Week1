package com.bridgelabz.datastructure;
public class UnOrderLinkedList 
{
	int size;
	Node start;
	public UnOrderLinkedList()
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
	 * Insert element at First in Linked list.
	 * @param data : the item which want to added at first position in list.
	 */
	public void addAtFirst(Object data)
	{
		Node node;
		node = new Node();
		node.setData(data);
		node.setNext(start);
		start = node;
		size++;
	}

	/**
	 * Insert element at Last in Linked list.
	 * @param data : the item which want to added at last position in list.
	 */
	public void append(Object data)
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
	 * Insert element at given position in Linked list. 
	 * @param data : the item which want to added at given position in list.
	 * @param position : position of a new data.
	 */
	public void insertAtPos(Object data, int position)
	{
		if(position == 1)
			addAtFirst(data);
		else if(position == size+1)
			append(data);
		else if(position > 1 && position <= size)
		{
			Node n,t;
			n = new Node(data ,null);
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
	
	public void addOrdered(Object data)
	{
		Node node=start, tempNode;
		if(isEmpty())
		{
			addAtFirst(data);
		}
		else
		{
			if(node.getData().hashCode() > data.hashCode())
			{
				
				
			}
		}
	}
	
	/**
	 * Delete First element from Linked List.
	 */
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

	/**
	 * Delete Last element from Linked List.
	 */
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
			Node t;
			t = start;
			for(int i=1; i<size-1; i++)
				t = t.getNext();
			t.setNext(null);
			size--;
		}
	}

	/**
	 * Delete element from given position from Linked list.
	 * @param pos : position of data which want to delete.
	 */
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

	/**
	 * Remove element from Linked list.
	 * @param s : element which want to delete from Linked List.
	 */
	public void remove(Object s)
	{
		Node current = start;				
		Node previous = null;
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

	/**
	 * Removes & return last element of a Linked list.	
	 * @return : returns last element of Linked list.
	 */
	public Object pop()
	{
		Node t = start;
		Object s = null;
		if(start == null)
		{
			System.out.println("List Is Already Empty");
		}
		else if(size == 1)
		{
			start = start.next;
			size--;
			return t.data;
		}
		else
		{
			t = start;
			for(int i=1; i<size-1; i++)
			{
				s = t.data;
				t = t.getNext();
			}
			s = t.getData();
			t.setNext(null);
			size--;
		}
		return t.data;
	}

	/**
	 * Removes element from given position and returns element..	
	 * @param pos : position of element which want to pop.
	 * @return : poped element.
	 */
	public Object pop(int pos)
	{
		int index = 0;
		Node n = start;
		if (pos == 0) 
		{
			start = start.next;
			size--;
			return n.data;
		}
		Node prev = null;
		while (index != pos)
		{
			prev = n;
			n = n.next;
			index++;
		}
		prev.next = n.next;
		size--;
		return n.data;
	}

	/**
	 * method to search given element from Linked list.
	 * @param val : element which want to search.
	 * @return : returns true if element found otherwise returns false.
	 */
	public boolean search(Object val)
	{
		Node t = start;
		while(t.next != null)
		{
			if(t.getData().hashCode() == val.hashCode())
			{
				return true;					// element found
			}
			t = t.next;
		}
		return false;							// element not found.
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
				System.out.print(tempNode.data+" ");
				tempNode = tempNode.next;
			}
		}
	}
}
