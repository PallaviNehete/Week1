/**
 * created by: Pallavi Nehete.
 * Date: 28/02/2019.
 * Purpose: Read the Text from a file, split it into words and arrange it as Linked List.
 * 			Take a user input to search a Word in the List. If the Word is not found then add it to the list, 
 * 			& if it found then remove the word from the List. In the end save the list into a file
 */

package com.bridgelabz.datastructure;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import com.bridgelabz.utility.Utility;
public class UnOrederedList 
{
	public static void main(String[] args) throws IOException 
	{
		Utility utility = new Utility();
		UnOrderLinkedList list = new UnOrderLinkedList();
		UnOrederedList unorder = new UnOrederedList();
		File file = new File("/home/admin1/Pallavi-workspace/Programs/src/com/bridgelabz/files/unorder.txt");
		String string = utility.readFromFile(file);
		System.out.println("Reading from File: "+string);
		String array[] = string.split(",");
		for(int i=0; i<array.length; i++)
		{
			list.append(array[i]);
		}
		System.out.print("Reading from List: ");
		list.display();
		System.out.print("\n\nEnter Word: ");
		String search = utility.inputString();
		boolean flag = list.search(search);
		if(!flag)
		{
			System.out.println("Word not found Hence added into file");
			list.append(search);
			utility.appendFile(file,search); 
			System.out.println("From List: ");
			list.display();
			String readString = utility.readFromFile(file);
			System.out.println("\n\nFrom File: "+readString);
		}
		else
		{
			System.out.println("Word found Hence Deleted from file");
			list.remove(search);
			System.out.println("From List: ");
			list.display();
			for(int i=0; i<array.length-1; i++)
			{
				array[i] = (String) list.pop(0);
			//	System.out.println("Array:  "+i+"\t"+array[i]);
				unorder.writeIntoFile(file, array);
			}
			String s = utility.readFromFile(file);
			System.out.println("\n\nFrom File: "+s);
		}
	}

	/**
	 * Method to write in File. 
	 * old contain of file is replaced with new containt.
	 * @param file : file name.
	 * @param array : array elements added into file.
	 * @throws IOException
	 */
	public void writeIntoFile(File file,String array[]) throws IOException
	{
		FileWriter filewriter = new FileWriter(file);
		for(int i=0; i<array.length-1;i++)
		{
			filewriter.write(array[i]+",");
		}
		filewriter.close();
	}
}
