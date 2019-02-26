package com.bridgelabz.datastructure;
public class Node 
{
	public String data;
	public Node next;
	public Node()
	{
		data = "";
		next = null;
	}
	public Node(String d, Node n)
	{
		data = d;
		next = n;
	}
	public void setData(String d) 
	{
		data = d;
	}
	public void setNext(Node n) 
	{
		next = n;
	}
	public String getData() 
	{
		return data;
	}
	public Node getNext() 
	{
		return next;
	}
}
