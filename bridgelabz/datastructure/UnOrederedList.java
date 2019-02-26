
package com.bridgelabz.datastructure;
import java.io.File;
import java.io.IOException;
import com.bridgelabz.utility.Utility;
public class UnOrederedList 
{
	public static void main(String[] args) throws IOException 
	{
		Utility utility=new Utility();
		LinkedList list = new LinkedList();
		File file = new File("/home/admin1/ReadWrite/demo.txt");
		String string = utility.readFromFile(file);
		System.out.println("Reading from File: "+string);
		String arr[] = string.split(" ");
		for(int i=0; i<arr.length; i++)
		{
			list.insert(arr[i]);
		}
		list.display();
		System.out.print("\nEnter Word: ");
		String search = utility.inputString();
		boolean flag = list.searchString(search);
		if(!flag)
		{
			System.out.println("Word not found Hence added into file");
			list.insert(search);
			utility.appendFile(search);  
			list.display();
		}
		else
		{
			System.out.println("Word found Hence Deleted from file");
			
			list.display();
		}
	}
}
