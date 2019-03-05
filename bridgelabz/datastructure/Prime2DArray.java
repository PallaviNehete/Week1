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
		while(number < 1000)
		{
			int primenumber = Utility.primeNumber(number);
			if(primenumber != 0)
			{
				System.out.println(primenumber);		
			}
			number++;
		}
		
		for(int i=0; i<prime.length; i++)
		{
			for(int j=0; j<prime[0].length; j++)
			{
				while(number < 1000)
				{
					int primenumber = utility.primeNumber(number);
					//System.out.println("hi");
					if(primenumber != 0)
					{
						
						prime[i][j] = primenumber;
					}
					number++;
				}
			}
		}


		for(int i=0; i<prime.length; i++)
		{
			for(int j=0; j<prime[0].length; j++)
			{
				System.out.println(prime[i][j]);
			}
		}
	}
}

