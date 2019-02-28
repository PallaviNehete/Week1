// new
package com.bridgelabz.datastructure;
public class Node<T> 
{
	public Object data;
	public Node<T> next;
	public Node()
	{
		data = "";
		next = null;
	}
	public Node(Object d, Node<T> n)
	{
		data = d;
		next = n;
	}
	public void setData(Object d) 
	{
		data = d;
	}
	public void setNext(Node<T> n) 
	{
		next = n;
	}
	public Object getData() 
	{
		return data;
	}
	public Node<T> getNext() 
	{
		return next;
	}
}
