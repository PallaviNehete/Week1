/*	User Input and Replace String Template “Hello <<UserName>>, How are you?” 
	I/P -> Take User Name as Input. Ensure UserName has min 3 char
	Logic -> Replace <<UserName>> with the proper name
	O/P -> Print the String with User Name 		*/

package com.bridgelabz.functional;
import com.bridgelabz.utility.Utility;
public class Username 
{
	public static void main(String[] args) 
	{
		Utility u=new Utility();
		String str="Hello <<username>>, How are You??";
		System.out.println("Original String is: "+str);
		System.out.print("\nEnter Username: ");
		String uName= u.inputString();
		if(uName.length()<=3)
		{
			System.out.print("Please Enter Full Name");
		}
		else
		{
			System.out.println("\nHello "+uName+", How are You??");
		}
	}
}
