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
		Utility utility = new Utility();
		String string = "Hello <<username>>, How are You??";
		System.out.println("Original String is: "+string);
		System.out.print("\nEnter Username: ");
		String uName = utility.inputString();
		utility.replaceString(string, uName);
	}
}
