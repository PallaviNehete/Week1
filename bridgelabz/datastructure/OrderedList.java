package com.bridgelabz.datastructure;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import com.bridgelabz.utility.Utility;
public class OrderedList 
{
	public static void main(String[] args) throws IOException 
	{
		Utility utility=new Utility();
		UnOrderLinkedList list = new UnOrderLinkedList();
		OrderedList ol = new OrderedList();
		File file = new File("/home/admin1/ReadWrite/ordered.txt");
		String string = ol.readFromFile(file);
		System.out.println("Reading from File: "+string);
		String array[] = string.split(" ");
		utility.insertionSortString(array);
		//utility.printIntString(arr);
		for(int i=0; i<array.length; i++)
		{
			list.append(array[i]);
		}
		System.out.print("Reading from List: ");
		list.display();
		System.out.print("\n\nEnter Number: ");
		int search = utility.inputInteger();
		
	}
	public String readFromFile(File f) throws IOException
	{
		String readString="";
		String temp;
		FileReader ip = new FileReader(f);
		BufferedReader br =new BufferedReader(ip);
		while((temp=br.readLine())!=null)
		{
			readString = readString + temp;
		}
		return readString;
	}
}
