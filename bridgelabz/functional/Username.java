/**
 * created by: Pallavi Nehete.
 * Date: 18/02/2019.
 * Purpose: Take a user name as input and replace <<UserName>> with the proper name.
 */

package com.bridgelabz.functional;
import com.bridgelabz.utility.Utility;
public class Username 
{
	public static void main(String[] args) 
	{
		Utility u = new Utility();
		String str = "Hello <<username>>, How are You??";
		System.out.println("Original String is: "+str);
		System.out.print("\nEnter Username: ");
		String uName = u.inputString();
		if(uName.length() <= 3)
		{
			System.out.print("Please Enter Full Name");
		}
		else
		{
			System.out.println("\nHello "+uName+", How are You??");
		}
	}
}
