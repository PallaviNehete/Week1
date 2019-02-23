/*	An Anagram Detection Example
	Desc -> One string is an anagram of another if the second is simply a rearrangement of the first. For example, 'heart' and 'earth' are anagrams...
	I/P -> Take 2 Strings as Input such abcd and dcba and Check for Anagrams
	O/P -> The Two Strings are Anagram or not....	*/

package com.bridgelabz.algorithms;
import java.util.Arrays;
import com.bridgelabz.utility.Utility;
public class AnagramDetection 
{
	public static void main(String[] args) 
	{
		String str1,str2;
		Utility u=new Utility();
		AnagramDetection ad=new AnagramDetection();
		System.out.print("Enter First String: ");
		str1=u.inputString();
		System.out.print("Enter Second String: ");
		str2=u.inputString();
		ad.anagram(str1, str2);
	}
	void anagram(String str1, String str2)
	{
		if(str1.length() != str2.length())
		{
			System.out.println("\n"+str1+" and "+str2+" are not an Anagram");
		}
		else
		{
			str1.toLowerCase();
			str2.toLowerCase();
			char s1 []=str1.toCharArray();
			char s2 []=str2.toCharArray();
			Arrays.sort(s1);
			Arrays.sort(s2);
			if(Arrays.equals(s1, s2))
			{
				System.out.println("\n"+str1+" and "+str2+" are in Anagram");
			}
			else
			{
				System.out.println("\n"+str1+" and "+str2+" are not an Anagram");
			}
		}
	}
}
