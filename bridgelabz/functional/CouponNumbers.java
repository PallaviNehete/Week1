/**
 * created by: Pallavi Nehete.
 * Date: 18/02/2019.
 * Purpose: Given N distinct Coupon Numbers, how many random numbers do you need to generate that distinct coupon number?
 */

package com.bridgelabz.functional;
import java.util.Random;
import com.bridgelabz.utility.Utility;
public class CouponNumbers
{
	public static void main(String[] args) 
	{
		Utility utility = new Utility();
		CouponNumbers coupon = new CouponNumbers();
		System.out.println("Enter the number of coupons: ");
		int noOfCoupons = utility.inputInteger();
		coupon.coupons(noOfCoupons);
	}
	
	/**
	 * method to find coupons.
	 * @param noOfCoupons : number of coupons.
	 */
	public void coupons(int noOfCoupons)
	{
		Random random=new Random();
		int count;
		char array[] = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890".toCharArray();
		char coupons[] = new char[noOfCoupons];
		for(int i=0; i<noOfCoupons; i++)
		{
			coupons[i] = array[random.nextInt(coupons.length)];
			System.out.println(coupons[i]+" ");
		}
		System.out.println("Distinct coupon numbers are :");
		for(int i=0; i<coupons.length; i++)
		{
			count=0;
			for(int j=i+1; j<coupons.length; j++)
			{
				if(coupons[i]==coupons[j])
				{
					count=1;
				}
			}
			if(count==0) 
			{
				System.out.println(coupons[i]);
			}
		}
	}
}
