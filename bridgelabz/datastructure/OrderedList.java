package com.bridgelabz.datastructure;
import java.io.File;
import java.io.IOException;
import com.bridgelabz.utility.Utility;
public class OrderedList 
{
	public static void main(String[] args) throws IOException 
	{
		Utility utility=new Utility();
		LinkedList list = new LinkedList();
		File file = new File("/home/admin1/ReadWrite/ordered.txt");
		String string = utility.readFromFile(file);
		System.out.println("Reading from File: "+string);
		String arr[] = string.split(" ");
		utility.InsertionSortString(arr);
		//utility.printIntString(arr);
		for(int i=0; i<arr.length; i++)
		{
			list.insert(arr[i]);
		}
		list.display();
		System.out.print("\nEnter Number: ");
		int search = utility.inputInteger();
		
	}
}
