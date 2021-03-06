/**
 * created by: Pallavi Nehete.
 * Date: 28/02/2019.
 * Purpose: To make a Linked List.
 */

package com.bridgelabz.datastructure;
public class UnOrderLinkedList
{
	int size;
	Node start;

	/** 
	 * constructor to declare variables.
	 */
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
	 * Method to get index of given data.
	 * @param data : data to find position in linked list.
	 * @return : returns position of data in linked list.
	 */
	public int indexOf(Object data)
	{
		int index = 0;
		Node node = start;
		while(node.next != null)
		{
			if(node.getData().hashCode() == data.hashCode())
			{
				return index;
			}
			index++;
			node = node.next;
		}
		if(search(data))
			return index+1;
		else
			return -1;
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
			Node node,temp;
			node = new Node(data ,null);
			temp = start;
			for(int i=1; i<position-1; i++)
				temp = temp.getNext();
			node.setNext(temp.getNext());
			temp.setNext(node);
			size++;
		}
		else
			System.out.println("Insertion not possible at position "+position);
	}

	/**
	 * Method to sort elements. 
	 * @param array : array which want to sort.
	 * @return : returns sorted array.
	 */
	public int[] sort(int [] array)
	{
		int size = array.length;
		for(int i=0; i<size; i++)
		{
			for(int j=1; j<size; j++)
			{
				if(array[j-1]>array[j])
				{
					int temp = array[j-1];
					array[j-1] = array[j];
					array[j] = temp;
				}
			}
		}
		return array;
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
	public void deleteAtPos(int position)
	{
		if(start == null)
			System.out.println("List is Already Empty");
		else if(position<1 || position>size)
			System.out.println("Invalid Position");
		else if(position == 1)
			deleteFirst();
		else if(position == size)
			deleteLast();
		else
		{
			Node node, temp;
			node = start;
			for(int i=1; i<position-1; i++)
				node = node.getNext();
			temp = node.getNext();
			node.setNext(temp.getNext());
			size--;
		}
	}

	/**
	 * Remove element from Linked list.
	 * @param element : element which want to delete from Linked List.
	 */
	public void remove(Object element)
	{
		Node current = start;				
		Node previous = null;
		while (current != null)			
		{
			if (current.data.equals(element))			
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
		Node node = start;
		Object s = null;
		if(start == null)
		{
			System.out.println("List Is Already Empty");
		}
		else if(size == 1)
		{
			start = start.next;
			size--;
			return node.data;
		}
		else
		{
			node = start;
			for(int i=1; i<size-1; i++)
			{
				s = node.data;
				node = node.getNext();
			}
			s = node.getData();
			node.setNext(null);
			size--;
		}
		return node.data;
	}

	/**
	 * Removes element from given position and returns element.	
	 * @param position : position of element which want to pop.
	 * @return : poped element.
	 */
	public Object pop(int position)
	{
		int index = 0;
		Node node = start;
		if (position == 0) 
		{
			start = start.next;
			size--;
			return node.data;
		}
		Node prev = null;
		while (index != position)
		{
			prev = node;
			node = node.next;
			index++;
		}
		prev.next = node.next;
		size--;
		return node.data;
	}

	/**
	 * method to search given element from Linked list.
	 * @param search : element which want to search.
	 * @return : returns true if element found otherwise returns false.
	 */
	public boolean search(Object search)
	{
		Node node = start;
		while(node != null)
		{
			if(node.getData().hashCode() == search.hashCode())
				return true;					// element found.
			node = node.next;
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
public static void main(String[] args) {

	UnOrderLinkedList u =new UnOrderLinkedList();
	u.append(59);

	
}
}

