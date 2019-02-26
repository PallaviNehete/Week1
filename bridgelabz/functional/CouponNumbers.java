/**
 * created by: Pallavi Nehete.
 * Date: 18/02/2019.
 * Purpose: Given N distinct Coupon Numbers, how many random numbers do you need to generate that distinct coupon number?
 */

package com.bridgelabz.functional;
public class CouponNumbers
{
	public static void main(String[] args) 
	{
		char array[] = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890".toCharArray();
		int max = 100000000;
		int random = (int)(Math.random()*max);
		StringBuffer s = new StringBuffer();
		while(random>0)
		{
			s.append(array[random % array.length]);
			random = random/array.length;
		}
		String couponNo = s.toString();
		System.out.println("Coupon Number is: "+couponNo);
	}
}
