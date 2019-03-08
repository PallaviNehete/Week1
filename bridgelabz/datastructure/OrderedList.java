/**
 * created by: Pallavi Nehete.
 * Date: 08/03/2019.
 * Purpose: Read a List of Numbers from a file and arrange it ascending Order in a Linked List.
 * 			Take user input for a number, if found then pop number out of list else insert number at appropriate position
 */

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
		OrderedList orderedList = new OrderedList();
		UnOrderLinkedList linkedlist = new UnOrderLinkedList();
		File file = new File("/home/admin1/Pallavi-workspace/Programs/src/com/bridgelabz/files/ordered.txt");
		String string =  utility.readFromFile(file);
		System.out.print("Reading from File: "+string+"\n");
		String splitArray[] = string.split(",");
		int intArray[] = new int[splitArray.length];
		//System.out.println("lenght:\t"+splitArray.length);
		for(int i=0; i<splitArray.length;i++)
		{
			String temp = splitArray[i];
			intArray[i] = Integer.parseInt(temp); 
		}
		utility.insertionSortInt(intArray);
		for(int i=0; i<intArray.length; i++)
		{
			linkedlist.append(intArray[i]);
		}
		System.out.print("\nFrom List: ");
		linkedlist.display();	
		System.out.print("\n\nEnter Number: ");
		int search = utility.inputInteger();
		boolean flag = linkedlist.search(search);
		if(flag)
		{
			System.out.println("\n"+search+" Found hence deleted");
			int index = linkedlist.indexOf(search);
			//System.out.println(index+1);
			linkedlist.deleteAtPos(index+1);
			System.out.print("From List: ");
			linkedlist.display();
			int size1 = linkedlist.getListSize();
			int storeArray[] = new int[size1];
			for(int i=0; i<size1; i++)
			{
			//	System.out.println(list.pop(0));
				storeArray[i] = (int)linkedlist.pop(0);
				orderedList.writeIntoFile(file, storeArray);
			}
			String readFile = utility.readFromFile(file);
			System.out.println("\nFrom File: "+readFile);
		}
		else
		{
			System.out.println("\n"+search+" Not Found hence added");
			linkedlist.append(search);
			System.out.print("From List: ");
			linkedlist.display();
			int size2 = linkedlist.getListSize();
			int storeArray[] = new int[size2];
			for(int i=0; i<size2; i++)
			{
				storeArray[i] = (int)linkedlist.pop(0);
			}
			linkedlist.sort(storeArray);
			orderedList.writeIntoFile(file, storeArray);
			String readFile = utility.readFromFile(file);
			System.out.println("\nFrom File: "+readFile);
		}
	}
	
	/**
	 * Method to write in File. 
	 * old data of file is replaced with new data.
	 * @param file : file name.
	 * @param array : array elements added into file.
	 * @throws IOException
	 */
	public void writeIntoFile(File file,int array[]) throws IOException
	{
		FileWriter fileWriter = new FileWriter(file);
		for(int i=0; i<array.length;i++)
		{
			fileWriter.write(array[i]+",");
		}
		fileWriter.close();
	}
}
