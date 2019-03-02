// new
package com.bridgelabz.datastructure;
public class Node 
{
	public Object data;
	public Node next;
	public Node()
	{
		data = "";
		next = null;
	}
	public Node(Object d, Node n)
	{
		data = d;
		next = n;
	}
	public void setData(Object d) 
	{
		data = d;
	}
	public void setNext(Node n) 
	{
		next = n;
	}
	public Object getData() 
	{
		return data;
	}
	public Node getNext() 
	{
		return next;
	}
}
