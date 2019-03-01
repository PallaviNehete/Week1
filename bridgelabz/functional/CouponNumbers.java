/**
 * created by: Pallavi Nehete.
 * Date: 18/02/2019.
 * Purpose: Given N distinct Coupon Numbers, how many random numbers do you need to generate that distinct coupon number?
 */

package com.bridgelabz.functional;
import com.bridgelabz.utility.Utility;
public class CouponNumbers
{
	public static void main(String[] args) 
	{
		Utility utility = new Utility();
		System.out.println("Enter the number of coupons: ");
		int noOfCoupons = utility.inputInteger();
		coupons(noOfCoupons);
	}
	
	/**
	 * method to find distinct coupons.
	 * @param noOfCoupons : number of coupons.
	 */
	public static void coupons(int noOfCoupons)
	{
		int check = 0;
		int array[] = new int[noOfCoupons];
		for(int i=0; i<array.length; i++)
		{
			array[i] = (int)(Math.random()* 1000);
		}
		for(int i=0; i<array.length; i++)
		{
			for(int j=i+1; j<array.length; j++)
			{
				if(array[i] == array[j])
				{
					check++;
				}
			}
			if(check==0)
				System.out.println(array[i]);
		}
	}
}
