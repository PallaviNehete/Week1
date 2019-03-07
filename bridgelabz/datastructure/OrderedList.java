
package com.bridgelabz.datastructure;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import com.bridgelabz.utility.Utility;
public class OrderedList 
{
	public static void main(String[] args) throws IOException 
	{
		Utility utility = new Utility();
		OrderedList ol = new OrderedList();
		UnOrderLinkedList list = new UnOrderLinkedList();
		File file = new File("/home/admin1/ReadWrite/ordered.txt");
		String string =  utility.readFromFile(file);
		System.out.print("Reading from File: "+string+"\n");
		String splitArr[] = string.split(",");
		int newArr[] = new int[splitArr.length];
		System.out.println("lenght:   "+splitArr.length);
		for(int i=0; i<splitArr.length;i++)
		{
			String temp = splitArr[i];
			newArr[i] = Integer.parseInt(temp); 
		}
		utility.insertionSortInt(newArr);
		for(int i=0; i<newArr.length; i++)
		{
			list.append(newArr[i]);
		}
		System.out.print("\nFrom List: ");
		list.display();	
		System.out.print("\n\nEnter Number: ");
		int search = utility.inputInteger();
		boolean flag = list.search(search);
		if(flag)
		{
			System.out.println("found");
			int index = list.indexOf(search);
			System.out.println(index+1);
			list.deleteAtPos(index+1);
			System.out.println("Found hence deleted\n");
			System.out.println("From List: ");
			list.display();
			int size = list.getListSize();
			int store[] = new int[size];
			for(int i=0; i<size; i++)
			{
				store[i] = (int)list.pop(0);
			}
			ol.writeIntoFile(store);
			String s = utility.readFromFile(file);
			System.out.println("\n\nFrom File: "+s);
		}
		else
		{
			System.out.println("Not Found hence added");	
			list.append(search);
			list.display();
			System.out.println();
			int store[] = new int[splitArr.length-1];
			for(int i=0; i<splitArr.length-1; i++)
			{
				store[i] = (int) list.pop(i);
			}
			ol.writeIntoFile(store);
			String s = utility.readFromFile(file);
			System.out.println("From File: "+s);
		}
	}
	
	/**
	 * Method to write into file.
	 * @param store : array of elements which want to added in file.
	 * @throws IOException
	 */
	public void writeIntoFile(int[] store) throws IOException
	{
		FileWriter fileWriter = new FileWriter("/home/admin1/ReadWrite/ordered.txt");
		for(int i=0; i<store.length; i++)
		{
			fileWriter.write(store[i]+",");
		}
		fileWriter.close();
	}
}
