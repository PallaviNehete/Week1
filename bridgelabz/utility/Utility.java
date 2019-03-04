/**
 * created by: Pallavi Nehete.
 * Date: 22/02/2019.
 * Purpose: Putting Commonly used function in single file
 */

package com.bridgelabz.utility;
import java.util.ArrayList;
import java.util.Scanner;
public class Utility 
{
	static Scanner scanner=new Scanner(System.in);
	/**
	 * Method to take a Integer Input from user.
	 * @return : integer value.
	 */
	public int inputInteger()
	{
		return (scanner.nextInt());
	}

	/**
	 * Method to take a String Input from user.
	 * @return : returns String value.
	 */
	public String inputString()
	{
		return (scanner.next());
	}

	/**
	 * Method to take a Double Input from user.
	 * @return : returns double value.
	 */
	public double inputDouble()
	{
		return (scanner.nextDouble());
	}

	/**
	 * Method to Insert in array Integer.
	 * @param array : array of integers.
	 */
	public void insertInArrayInt(int array[])
	{
		for(int i=0; i<array.length; i++)
			array[i] = scanner.nextInt();
	}

	/**
	 * Method to Insert in array String.
	 * @param array : array of Strings.
	 */
	public void insertInArrayString(String array[])
	{
		for(int i=0; i<array.length; i++)
			array[i] = scanner.next();
	}

	/**
	 * Method to print Integer type of Array.
	 * @param array : array of integers.
	 */
	public void printIntArr(int array[])
	{
		for(int j=0; j<array.length; j++)
			System.out.println(array[j]+" ");
	}

	/**
	 * Method to print String type of Array.
	 * @param array : array of string.
	 */
	public void printIntString(String array[])
	{
		for(int j=0; j<array.length; j++)
			System.out.println(array[j]);
	}
	
	/**
	 * Take a user name as input and replace <<UserName>> with the proper name.
	 * @param string : input String.
	 * @param uName : user name.
	 */
	public void replaceString(String string, String uName)
	{
		if(uName.length() <= 3)
			System.out.print("Please Enter Full Name");
		else
		{
			String output = string.replaceAll("<<username>>", uName);
			System.out.println(output);
		}
	}
	
	/**
	 * Method to find Euclidean distance from point (x,y) to the origin (0,0).
	 * @param x : distance of x from origin (0,0). 
	 * @param y : distance of y from origin (0,0).
	 * @return : distance from point (x,y) to the origin(0,0).
	 */
	public double distance(double x , double y)
	{
		double euclideanDistance = Math.sqrt(x*x+y*y);
		return euclideanDistance;
	}

	/**
	 * method to check wheather it is prime factor or not.
	 * @param number
	 * @return prime numbers.
	 */
	public int checkPrimeFactor(int number)
	{
		for(int i=2; i<=number; i++)
		{
			while(number%i == 0)
			{
				System.out.println(i);
				number = number/i;	
			}
		}
		if(number>2)
			return number;
		return 0;
	}

	/**
	 * method to find the roots of the equation a*x*x + b*x + c. 
	 * @param a : 1st co-efficient of quadratic equation.
	 * @param b : 2nd co-efficient of quadratic equation.
	 * @param c : constant co-efficient of quadratic equation.
	 */
	public void quadratic(int a, int b, int c)
	{
		double rootX1,rootX2;
		int delta = b*b-4*a*c;
		System.out.println("Value of Delta: "+delta);
		if(delta >= 0)
		{
			rootX1 = (-b+ Math.sqrt(delta))/(2*a);
			rootX2 = (-b- Math.sqrt(delta))/(2*a);
			System.out.println("\n1st Root of Quadratic Equation is: "+rootX1);
			System.out.println("2nd Root of Quadratic Equation is: "+rootX2);
		}
		else
			System.out.println("\nRoots of Quadratic Equation are Imaginary");
	}

	/**
	 * Method to determine whether entered year is Leap year or not.
	 * @param year : it is a year.
	 * @return : returns true if it is a leap year otherwise returns false.
	 */
	public boolean isLeapYear(int year)
	{
		if((year%4 == 0) && (year%100!=0))
			return true;
		else if(year%400 == 0)
			return true;
		else
			return false;
	}
	
	/**
	 * method to find day.
	 * @param year : taken from user to find day.
	 * @param month : taken from user to find day.
	 * @param date : taken from user to find day.
	 * @return : day of week.
	 */
	public int dayWeek(int year, int month, int date)
	{
		int y0 = year - (14 - month) / 12;
		int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
		int m0 = month + 12 * ((14 - month) / 12) - 2;
		int d0 = (date + x + (31 * m0) / 12) % 7;
		return d0;
	}
	
	/**
	 * to find binary representation of a decimal number.
	 * @param number : number to find binary representation.
	 * @return : binary representation of a decimal number.
	 */
	public String toBinary(int number)
	{
		String binary="";
		while(number > 0)
		{
			binary = (number%2) + binary;
			number = number/2;
		}
		while(binary.length()<4)
		{
			binary = 0+binary;
		}
		return binary;	
	}
	
	/**
	 * method to swap binary nibbles.
	 * @param binary : binary number.
	 * @return : binary number after swap nibbles.
	 */
	public char[] swapNibbles(String binary)
	{
		int i = 0;
		char temp;
		char swap[] = binary.toCharArray();
		int j = swap.length-4;
		for(i=0; i<4; i++)
		{
			temp = swap[j];
			swap[j] = swap[i];
			swap[i] = temp;
			j++;
		}
		return swap;
	}
	
	/**
	 * method to convert binary to decimal.
	 * @param swapNo : swaped binary number.
	 * @return : decimal representation of swapNo.
	 */
	public int binaryToDecimal(int swapNo)
	{
		int decimal = 0, n = 0;
		while(swapNo >= 0)
		{
			if(swapNo == 0)
				break;  
			else
			{  
				int lastDig =swapNo%10;  
				decimal = (int)(decimal+ lastDig*Math.pow(2, n));  
				swapNo = swapNo/10;  
				n++;  
			}  
		}
		return decimal;
	}
	
	/**
	 * Method to check for Prime Numbers.
	 * @param number : start position of prime numbers.
	 * @return : prime number
	 */
	public static int primeNumber(int number)
	{
		int count = 0;
		if(number!=0 && number!=1)
		{
			for(int i=2; i<number; i++)
			{
				if(number%i == 0)
				{
					count++;
					break;
				}
			}
			if(count == 0)
			{
				return number;
			}
		}
		return 0;
	}

	/**
	 * method to find prime palindrome.
	 * @param number : number to check wheather it is prime palindrome or not.
	 */
	public void primePlindrom(int number)
	{
		int count = 0;
		if(number!=0 && number!=1)
		{
			for(int i=2; i<number; i++)
			{
				if(number%i == 0)
				{
					count++;
					break;
				}
			}
			if(count == 0)
			{
				int reverse = 0,temp,digit;
				temp = number;
				while(number > 0)
				{
					digit = number % 10;
					reverse = reverse*10+ digit;
					number = number/10;
				}
				if(reverse == temp)
				{
					System.out.print(temp+" ");
				}
			}
		}
	}
	
	/**
	 * method to find prime anagrams.
	 */
	public void primeAnagrams() 
	{
		ArrayList<Integer> list= new ArrayList<Integer>();
		boolean check;
		for(int j=2; j<=1000; j++) 
		{
			check = true;
			for (int i=2; i<j/2; i++)
			{
				if (j%i == 0) 
				{
					check=false;
					break;
				}
			}
			if (check)
			{
				list.add(j);
			}
		}
		for (int i=0; i<list.size(); i++)
		{
			for (int j=i+1; j<list.size(); j++) 
			{
				if (anagram(list.get(i),list.get(j))) 
				{
					System.out.println(list.get(i)+"\t"+list.get(j));
				}
			}
		}
	}
	
	/**
	 * method to find to numbers are in anagram or not.
	 * @param number1 : First number. 
	 * @param number2 : Second number.
	 * @return : return true if numbers are anagram otherwise gives false.
	 */
	public static boolean anagram(int number1, int number2) 
	{
		int n1count[] = countDigits(number1);
		int n2count[] = countDigits(number2);
		for (int i=0; i<n2count.length; i++) 
		{
			if (n1count[i] != n2count[i]) 
				return false;
		}
		return true;
	}
	
	/**
	 * method to count digits of number.
	 * @param number : number to count digits.
	 * @return : digits of a number.
	 */
	public static int[] countDigits(int number) 
	{
		int count[] = new int[10];
		int temp = number;
		while (temp != 0) 
		{
			int remender = temp%10;
			count[remender]++;
			temp=temp/10;
		}
		return count;
	}
	
	/**
	 * Method to Sort Integers using Insertion sort.
	 * @param array : array of integers.
	 */
	public void insertionSortInt(int array[])
	{
		int temp;
		for(int i=0; i<array.length; i++)
		{
			for(int j=i+1; j<array.length; j++)
			{
				if(array[i] > array[j])
				{
					temp = array[j];
					array[j] = array[i];
					array[i] = temp;
				}
			}
		}
	}  

	/**
	 * Method to Sort String using Insertion sort.
	 * @param array : array of String.
	 */
	public void insertionSortString(String array[])
	{
		String temp;
		for(int i=0; i<array.length; i++)
		{
			for(int j=i+1; j<array.length; j++)
			{
				if(array[i].compareToIgnoreCase(array[j])>0)
				{
					temp = array[j];
					array[j] = array[i];
					array[i] = temp;
				}
			}
		}
	}

	/**
	 * Method to Sort Integers using Bubble sort.
	 * @param array : array of integers.
	 */
	public void bubbleSortInt(int array[])
	{
		int temp;
		for(int i=0; i<array.length; i++)
		{
			for(int j=0; j<array.length-i-1; j++)
			{
				if(array[j] > array[j+1])
				{
					temp = array[j];  
					array[j] = array[j+1];  
					array[j+1] = temp; 
				}
			}
		}
	}

	/**
	 * Method to Sort String using Bubble sort.
	 * @param array : array of String.
	 */
	public void bubbleSortString(String array[])
	{
		String temp;
		for(int i=0; i<array.length; i++)
		{
			for(int j=i+1; j<array.length-i; j++)
			{
				if(array[j].compareToIgnoreCase(array[j-1]) > 0)
				{
					temp = array[j];
					array[j] = array[j-1];
					array[j-1] = temp;
				}
			}
		}
	}

	/**
	 * Method to Search Integers using Binary search.
	 * @param array : array of integers.
	 * @param search : element to search from array.
	 */
	public void binarySearchInt(int array[], int search)
	{
		int low = 0, high = array.length-1;
		int mid = low + (high-low)/2;
		while (low <= high) 
		{
			mid = low+(high-low)/2;
			if(search > array[mid])
			{
				low = mid+1;
			}
			else if(search == array[mid])
			{
				System.out.println("Number found at "+(mid+1)+" position");
				break;
			}
			else
			{
				high = mid-1;
			}
			mid = (high+low)/2;
		}
		if(low > high)
			System.out.println("Number not Found");
	}

	/**
	 * Method to Search Strings using Binary search.
	 * @param array : array of String.
	 * @param search : element to search from array.
	 */
	public void binarySearchString(String array[], String search)
	{
		int low = 0, high = array.length-1;
		int mid = 0;
		mid = low+(high-low)/2;
		while (low <= high) 
		{
			if(search.compareToIgnoreCase(array[mid]) > 0)
			{
				low = mid+1;
			}
			else if(search.compareToIgnoreCase(array[mid]) == 0)
			{
				System.out.println("Word is found at "+(mid+1)+" position");
				break;
			}
			else
			{
				high = mid-1;
			}
			mid = (high+low)/2;
		}
		if(low>high)
			System.out.println("String not found");
	}
}
