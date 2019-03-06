

package com.bridgelabz.datastructure;
public class Prime2DArray 
{
	public static void main(String[] args)
	{
		int prime2DMatrix[][] = twoDprime();
		for(int i=0; i<prime2DMatrix.length; i++)
		{
			for(int j=0; j<prime2DMatrix[0].length; j++)
			{
				System.out.print(prime2DMatrix[i][j]+" ");
			}
			System.out.println();
		}
	}

	/**
	 * to find prime 2D matrix.
	 * @return : returns prime 2D matrix.
	 */
	public static int[][] twoDprime()
	{
		int primeMatrix[][] = new int [10][25];
		int count1=0, count2=0, count3=0, count4=0, count5=0, count6=0, count7=0, count8=0, count9=0, count10=0;
		for(int i=2; i<1000; i++)
		{
			if(isPrime(i))
			{
				if(i>0 && i<100)
				{
					primeMatrix[0][count1] = i;
					count1++;
				}
				if(i>100 && i<200)
				{
					primeMatrix[1][count2] = i;
					count2++;
				}
				if(i>200 && i<300)
				{
					primeMatrix[2][count3] = i;
					count3++;
				}
				if(i>300 && i<400)
				{
					primeMatrix[3][count4] = i;
					count4++;
				}
				if(i>400 && i<500)
				{
					primeMatrix[4][count5] = i;
					count5++;
				}
				if(i>500 && i<600)
				{
					primeMatrix[5][count6] = i;
					count6++;
				}
				if(i>600 && i<700)
				{
					primeMatrix[6][count7] = i;
					count7++;
				}
				if(i>700 && i<800)
				{
					primeMatrix[7][count8] = i;
					count8++;
				}
				if(i>800 && i<900)
				{
					primeMatrix[8][count9] = i;
					count9++;
				}
				if(i>900 && i<1000)
				{
					primeMatrix[9][count10] = i;
					count10++;
				}
			}
		}
		return primeMatrix;
	}
	
	/**
	 * Method to check number is prime or not.
	 */
	public static boolean isPrime(int n)
	{  
		boolean flag = true;
		if (n<=1) 
		{  
			flag = false;  
		}  
		for (int i=2; i<n; i++)
		{  
			if (n%i == 0) 
			{  
				flag = false;  
			}  
		}  
		return flag;  
	}  
}


