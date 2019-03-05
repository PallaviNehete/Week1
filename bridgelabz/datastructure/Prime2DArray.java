package com.bridgelabz.datastructure;
import com.bridgelabz.utility.Utility;
public class Prime2DArray 
{
	public static void main(String[] args) 
	{
		Utility utility = new Utility();
		int prime[][] = new int [10][25];
		String range[] = {"0-100","100-200","300-400","400-500","500-600","600-700","700-800","800-900","900-1000"};
		int number = 0;

		int count[] = new int[170];
		for(int i = 0; i<count.length; i++)
		{
			while(number < 1000)
			{
				int primenumber = Utility.primeNumber(number);
				if(primenumber != 0)
				{

					count[i] = primenumber;

				}
			}
			number++;
		}
		for(int i = 0; i<count.length; i++)
		{
			System.out.println(count[i]);

		}
	}
}
